package chess.pieces;

import chess.Piece;

public class Pawn implements Piece {
    private boolean changed;
    private Piece changedTo;
    private String moveDirection;
    private boolean movedBefore;
}
