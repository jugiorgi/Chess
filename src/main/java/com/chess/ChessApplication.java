package com.chess;

import com.chess.chess.ChessMatch;

public class ChessApplication {

    public static void main(String[] args) {
        ChessMatch match = new ChessMatch();
        UI.printBoard(match.getPieces());
    }

}
