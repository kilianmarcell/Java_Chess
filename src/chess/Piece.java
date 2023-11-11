package chess;

public interface Piece {
    Square position = null;
    String color = null;

    default Square[] possibleMoves() {
        return null;
    }
}
