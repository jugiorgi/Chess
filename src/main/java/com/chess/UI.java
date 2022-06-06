package com.chess;

import com.chess.chess.ChessPiece;

import java.util.Objects;

public class UI {

    private static final String SPACE = " ";
    private static final String EMPTY = "-";
    private static final String FINAL_LINE = "  a b c d e f g h";
    private static final int ZERO = 0;
    private static final int EIGTH = 8;

    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = ZERO; i < pieces.length; i++) {
            System.out.print((EIGTH - i) + SPACE);
            for (int j = ZERO; j < pieces.length; j++) {
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println(FINAL_LINE);
    }

    private static void printPiece(ChessPiece piece) {
        if (Objects.isNull(piece)) {
            System.out.print(EMPTY);
            System.out.print(SPACE);
            return;
        }
        System.out.print(piece);
        System.out.print(SPACE);
    }
}
