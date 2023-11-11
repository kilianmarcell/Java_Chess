package chess;

import javax.swing.*;

public class Square extends JPanel {
    private int row;
    private int column;

    public Square(int row, int column) {
        this.row = row;
        this.column = column;
    }
}
