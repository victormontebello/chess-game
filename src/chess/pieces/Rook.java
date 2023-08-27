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
        Position pos = new Position(0, 0);
        // above
        pos.setValues(position.getRow() - 1, position.getColumn());
        while (getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) { // while position exists and there is no piece
            mat[pos.getRow()][pos.getColumn()] = true;
            pos.setRow(pos.getRow() - 1);
        }
        if (getBoard().positionExists(pos) && isThereOpponentPiece(pos)) // if position exists and there is an opponent piece
            mat[pos.getRow()][pos.getColumn()] = true;
        // left
        pos.setValues(position.getRow(), position.getColumn() - 1);
        while (getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) { // while position exists and there is no piece
            mat[pos.getRow()][pos.getColumn()] = true;
            pos.setColumn(pos.getColumn() - 1);
        }
        if (getBoard().positionExists(pos) && isThereOpponentPiece(pos)) // if position exists and there is an opponent piece
            mat[pos.getRow()][pos.getColumn()] = true;
        // right
        pos.setValues(position.getRow(), position.getColumn() + 1);
        while (getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) { // while position exists and there is no piece
            mat[pos.getRow()][pos.getColumn()] = true;
            pos.setColumn(pos.getColumn() + 1);
        }
        if (getBoard().positionExists(pos) && isThereOpponentPiece(pos)) // if position exists and there is an opponent piece
            mat[pos.getRow()][pos.getColumn()] = true;
        // below
        pos.setValues(position.getRow() + 1, position.getColumn());
        while (getBoard().positionExists(pos) && !getBoard().thereIsAPiece(pos)) { // while position exists and there is no piece
            mat[pos.getRow()][pos.getColumn()] = true;
            pos.setRow(pos.getRow() + 1);
        }
        if (getBoard().positionExists(pos) && isThereOpponentPiece(pos)) // if position exists and there is an opponent piece
            mat[pos.getRow()][pos.getColumn()] = true;
        return mat;
    }

}
