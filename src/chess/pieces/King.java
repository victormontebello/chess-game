package chess.pieces;
import boardgame.*;
import chess.*;
public class King extends ChessPiece{

    public King(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString() {
        return "K";
    }
}
