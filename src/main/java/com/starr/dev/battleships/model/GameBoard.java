package com.starr.dev.battleships.model;

import com.starr.dev.battleships.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;

public class GameBoard {

    Cell[][] board;
    int gameBoardLength;
    int shipNumber;

    public GameBoard(int gameBoardLength, int shipNumber) {
        this.gameBoardLength = gameBoardLength;
        this.shipNumber = shipNumber;
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
