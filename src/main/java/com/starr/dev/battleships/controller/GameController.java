package com.starr.dev.battleships.controller;

import com.starr.dev.battleships.model.GameBoard;
import com.starr.dev.battleships.service.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/battleships")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/play")
    public ResponseEntity<StringBuilder> play() {
        GameBoard gameBoard = new GameBoard(8, 4);
        gameBoard.setBoard(gameService.createBoardWithShips(gameBoard.getGameBoardLength(), gameBoard.getShipNumber()));
        char[][] chars = new char[gameBoard.getGameBoardLength()][gameBoard.getGameBoardLength()];
        printChars(gameBoard, chars);
        StringBuilder returnString = new StringBuilder("");
        for (int i = 0; i < gameBoard.getGameBoardLength(); i++) {
            for (int j = 0; j < gameBoard.getGameBoardLength(); j++) {
                returnString.append(chars[i][j]);
//                if (i == gameBoard.getGameBoardLength() - 1)
//                    returnString.append("\r\n");
            }
        }
        returnString.insert(8, "\r\n");
        returnString.insert(20, "\r\n");
        returnString.insert(32, "\r\n");
        returnString.insert(44, "\r\n");
        returnString.insert(56, "\r\n");
        return ResponseEntity.ok(returnString);
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
