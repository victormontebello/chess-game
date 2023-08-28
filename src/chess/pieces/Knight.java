package chess.pieces;

import chess.*;
import boardgame.*;


public class Knight extends ChessPiece {

    public Knight(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "N";
    }
    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position); // p = piece
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()]; // mat = matrix

        Position pos = new Position(0, 0);

        pos.setValues(position.getRow() - 1, position.getColumn()-2);
        if (getBoard().positionExists(pos) && canMove(pos)) // if position exists and there is no piece
            mat[pos.getRow()][pos.getColumn()] = true;

        pos.setValues(position.getRow() -2, position.getColumn()-1);
        if (getBoard().positionExists(pos) && canMove(pos)) // if position exists and there is no piece
            mat[pos.getRow()][pos.getColumn()] = true;

        pos.setValues(position.getRow()-2, position.getColumn() + 1);
        if (getBoard().positionExists(pos) && canMove(pos)) // if position exists and there is no piece
            mat[pos.getRow()][pos.getColumn()] = true;

        pos.setValues(position.getRow()-1, position.getColumn() + 2);
        if (getBoard().positionExists(pos) && canMove(pos)) // if position exists and there is no piece
            mat[pos.getRow()][pos.getColumn()] = true;

        pos.setValues(position.getRow() + 1, position.getColumn() +2);
        if (getBoard().positionExists(pos) && canMove(pos)) // if position exists and there is no piece
            mat[pos.getRow()][pos.getColumn()] = true;

        pos.setValues(position.getRow() +2, position.getColumn() + 1);
        if (getBoard().positionExists(pos) && canMove(pos)) // if position exists and there is no piece
            mat[pos.getRow()][pos.getColumn()] = true;

        pos.setValues(position.getRow() + 2, position.getColumn() - 1);
        if (getBoard().positionExists(pos) && canMove(pos)) // if position exists and there is no piece
            mat[pos.getRow()][pos.getColumn()] = true;

        pos.setValues(position.getRow() + 1, position.getColumn() -2);
        if (getBoard().positionExists(pos) && canMove(pos)) // if position exists and there is no piece
            mat[pos.getRow()][pos.getColumn()] = true;

        return mat;
    }
}
