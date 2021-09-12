package com.starr.dev.battleships.service;

import com.starr.dev.battleships.model.Cell;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameService {

    public Cell[][] createBoardWithShips(int gameBoardLength, int shipNumber) {
        Cell[][] board = new Cell[gameBoardLength][gameBoardLength];
        for (int i = 0; i < gameBoardLength; i++)
            for (int j = 0; j < gameBoardLength; j++)
                board[i][j] = new Cell();

        int placedShips = 0;

        while (placedShips < shipNumber) {
            int[] location = generateShipCoordinates(gameBoardLength);
            Cell possiblePlacement = board[location[0]][location[1]];

            if (possiblePlacement.isWater()) {
                board[location[0]][location[1]].setShipPiece(true);
                board[location[0]][location[1]].setWater(false);
                placedShips++;
            }
        }
        return board;
    }

    private int[] generateShipCoordinates(int gameBoardLength) {
        int[] coordinates = new int[2];
        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i] = new Random().nextInt(gameBoardLength);
        }
        return coordinates;
    }
}
