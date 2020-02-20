package com.designpattern.mediator;

public class ArticleDialogBox extends DialogBox {
    private ListBox articleListBox = new ListBox(this);
    private TextBox titleTextBox = new TextBox(this);
    private Button saveButton = new Button(this);

    public void simulateUserInteraction() {
        articleListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        articleListBox.setSelection("Article 2");
        System.out.println("Textbox: "+titleTextBox.getContent());
        System.out.println("Button: "+saveButton.isEnabled());
    }

    @Override
    public void changed(UIControl control) {
        if(control == articleListBox) {
            articleSelected();
        } else if(control == titleTextBox) {
            titleChanged();
        }
    }

    private void articleSelected() {
        this.titleTextBox.setContent(articleListBox.getSelection());
        saveButton.setEnabled(true);
    }
    private void titleChanged() {
        String content = titleTextBox.getContent();
        boolean isEmpty = (content==null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }
}
