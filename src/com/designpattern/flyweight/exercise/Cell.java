package com.designpattern.flyweight.exercise;

public class Cell {
    private final int row;
    private final int column;
    private String content;
    private CellAttribute cellAttribute;


    public CellAttribute getCellAttribute() {
        return cellAttribute;
    }

    public void setCellAttribute(CellAttribute cellAttribute) {
        this.cellAttribute = cellAttribute;
    }

//    private String fontFamily;
//    private int fontSize;
//    private boolean isBold;

    public Cell(int row, int column, CellAttribute cellAttribute) {
        this.row = row;
        this.column = column;
        this.cellAttribute = cellAttribute;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void render() {
        System.out.printf("(%d, %d): %s [%s]\n", row, column, content, cellAttribute.getFontFamily());
    }

}
