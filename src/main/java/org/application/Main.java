package org.application;

import chess.ChessMatch;

public class Main {
    public static void main(String[] args) {
        var chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}