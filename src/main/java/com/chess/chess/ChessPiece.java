package com.chess.chess;

import com.chess.boardgame.Board;
import com.chess.boardgame.Piece;
import lombok.Getter;

@Getter
public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
}
