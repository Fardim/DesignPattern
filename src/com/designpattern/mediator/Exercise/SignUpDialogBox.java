package com.designpattern.mediator.Exercise;

public class SignUpDialogBox {
    private PasswordTextBox passwordTextBox = new PasswordTextBox();
    private UsernameTextBox usernameTextBox = new UsernameTextBox();
    private TermsCheckBox termsCheckBox = new TermsCheckBox();
    private SignupButton signupButton = new SignupButton();

    public SignUpDialogBox() {
        this.passwordTextBox.attachObserver(new Observer() {
            @Override
            public void update() {
                enableSignupButton();
            }
        });
        this.usernameTextBox.attachObserver(new Observer() {
            @Override
            public void update() {
                enableSignupButton();
            }
        });
        this.termsCheckBox.attachObserver(new Observer() {
            @Override
            public void update() {
                enableSignupButton();
            }
        });
    }

    public void simulation() {
        passwordTextBox.setPassword("Article 1");
        usernameTextBox.setUsername("username");
        termsCheckBox.setTermsChecked(true);
        System.out.println("Password: "+passwordTextBox.getPassword());
        System.out.println("username: "+usernameTextBox.getUsername());
        System.out.println("checkbox: "+termsCheckBox.isTermsChecked());
        System.out.println("signup: "+signupButton.isEnabled());
    }

    public void enableSignupButton() {
        String pass = this.passwordTextBox.getPassword();
        String name = this.usernameTextBox.getUsername();
        Boolean checkbox = this.termsCheckBox.isTermsChecked();
        boolean canEnable = (checkbox && pass!=null && !pass.isEmpty() && name!=null && !name.isEmpty());
        this.signupButton.setEnabled(canEnable);

    }
}
