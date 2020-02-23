package com.designpattern.flyweight.exercise;

public class SpreadSheet {
    private final int MAX_ROWS = 3;
    private final int MAX_COLS = 3;

    // In a real app, these values should not be hardcoded here.
    // They should be read from a configuration file.
    private final String fontFamily = "Times New Roman";
    private final int fontSize = 12;
    private final boolean isBold = false;
    private CellAttributeFactory factory;

    private Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];

    public SpreadSheet(CellAttributeFactory factory) {
        this.factory = factory;
        generateCells();
    }

    public void setContent(int row, int col, String content) {
        ensureCellExists(row, col);

        cells[row][col].setContent(content);
    }

    public void setFontFamily(int row, int col, String fontFamily) {
        ensureCellExists(row, col);
        Cell cell = cells[row][col];
        CellAttribute attribute = new CellAttribute(fontFamily, cell.getCellAttribute().getFontSize(), cell.getCellAttribute().isBold());
        cell.setCellAttribute(attribute);
    }

    private void ensureCellExists(int row, int col) {
        if (row < 0 || row >= MAX_ROWS)
            throw new IllegalArgumentException();

        if (col < 0 || col >= MAX_COLS)
            throw new IllegalArgumentException();
    }

    private void generateCells() {
        for (int row = 0; row < MAX_ROWS; row++)
            for (int col = 0; col < MAX_COLS; col++) {
                Cell cell = new Cell(row, col, factory.getCellAttribute(fontFamily, fontSize, isBold));
                cells[row][col] = cell;
            }
    }

    public void render() {
        for (int row = 0; row < MAX_ROWS; row++)
            for (int col = 0; col < MAX_COLS; col++)
                cells[row][col].render();
    }
}
