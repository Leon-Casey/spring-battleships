package com.starr.dev.battleships.model;

import com.starr.dev.battleships.service.GameService;

public class GameBoard {

    Cell[][] board;
    int gameBoardLength = 4;
    int shipNumber = 3;

    public GameBoard() {
        this.board = GameService.createBoardWithShips(gameBoardLength, shipNumber);
    }


    public Cell[][] getBoard() {
        return board;
    }

    public void setBoard(Cell[][] board) {
        this.board = board;
    }

    public int getGameBoardLength() {
        return gameBoardLength;
    }

    public void setGameBoardLength(int gameBoardLength) {
        this.gameBoardLength = gameBoardLength;
    }

    public int getShipNumber() {
        return shipNumber;
    }

    public void setShipNumber(int shipNumber) {
        this.shipNumber = shipNumber;
    }
}
