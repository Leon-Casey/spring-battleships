package com.starr.dev.battleships.controller;

import com.starr.dev.battleships.model.GameBoard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/battleships")
public class GameController {

    @GetMapping("/play")
    public StringBuilder play() {
        GameBoard gameBoard = new GameBoard();
        char[][] chars = new char[gameBoard.getGameBoardLength()][gameBoard.getGameBoardLength()];
        printChars(gameBoard, chars);
        StringBuilder returnString = new StringBuilder();
        for (int i = 0; i < gameBoard.getGameBoardLength(); i++) {
            for (int j = 0; j < gameBoard.getGameBoardLength(); j++) {
                returnString.append(chars[i][j]);
                if (i == gameBoard.getGameBoardLength() - 1)
                    returnString.append("\r\n");
            }
        }
        return returnString;
    }

    private void printChars(GameBoard board, char[][] chars) {
        for (int i = 0; i < board.getGameBoardLength(); i++) {
            for (int j = 0; j < board.getGameBoardLength(); j++) {
                if (board.getBoard()[i][j].isWater())
                    chars[i][j] = "-".toCharArray()[0];
                else if (board.getBoard()[i][j].isShipPiece())
                    chars[i][j] = "s".toCharArray()[0];
            }
        }
    }
}
