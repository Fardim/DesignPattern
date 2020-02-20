package com.designpattern.mediator.Observer;

public class ArticleDialogBoxObs {
    private ListBoxObs articleListBox = new ListBoxObs();
    private TextBoxObs titleTextBox = new TextBoxObs();
    private ButtonObs saveButton = new ButtonObs();

    public ArticleDialogBoxObs() {
        articleListBox.addEventHandler(new Observer() {
            @Override
            public void handle() {
                articleSelected();
            }
        });
        titleTextBox.addEventHandler(new Observer() {
            @Override
            public void handle() {
                titleChanged();
            }
        });
    }

    public void simulateUserInteraction() {
        articleListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        articleListBox.setSelection("Article 2");
        System.out.println("Textbox: "+titleTextBox.getContent());
        System.out.println("Button: "+saveButton.isEnabled());
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

