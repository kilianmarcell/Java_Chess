package chess;

import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
    public Square squares[][] = new Square[8][8];
    private PieceSet[] pieceSets = new PieceSet[2];

    public void create() {
        setBounds(8, 8, 640, 640);
        setTitle("Chess");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 8));
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Square square = new Square(i, j);
                squares[i][j] = square;

                square.setSize(80, 80);
                if((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) square.setBackground(Color.WHITE);
                else square.setBackground(Color.BLACK);
                square.setVisible(true);
                add(squares[i][j]);
            }
        }

        setVisible(true);
    }

    public Square getSquare(int row, int column) {
        return squares[row][column];
    }

    public Square[][] getSquares() {
        return squares;
    }

    public void setSquares(Square[][] squares) {
        this.squares = squares;
    }

    public PieceSet[] getPieceSets() {
        return pieceSets;
    }

    public void setPieceSets(PieceSet[] pieceSets) {
        this.pieceSets = pieceSets;
    }
}
