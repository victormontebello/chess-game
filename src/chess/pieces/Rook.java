package chess.pieces;
import chess.*;
import boardgame.*;
public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()]; // mat = matrix
        return mat;
    }
}
