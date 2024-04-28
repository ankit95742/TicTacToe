package org.tictactoe;

import org.tictactoe.controllers.GameController;
import org.tictactoe.models.Game;
import org.tictactoe.models.Player;
import org.tictactoe.models.PlayerType;
import org.tictactoe.models.Symbol;
import org.tictactoe.strategies.winningStrategy.ColumnWinningStrategy;
import org.tictactoe.strategies.winningStrategy.DiagonalWinningStrategy;
import org.tictactoe.strategies.winningStrategy.RowWinningStrategy;
import org.tictactoe.strategies.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) {
        System.out.println("GAME STARTS");
        Scanner scanner = new Scanner(System.in);
        GameController gameController = new GameController();

        int dimension = 3;

        List<Player> players = new ArrayList<>();
        players.add(
                new Player(new Symbol('X'), "Anand", PlayerType.HUMAN)
        );

        players.add(
                new Player(new Symbol('O'), "Scaler", PlayerType.HUMAN)
        );

        List<WinningStrategy> winningStrategies = List.of(
                new RowWinningStrategy(),
                new ColumnWinningStrategy(),
                new DiagonalWinningStrategy()
        );

        Game game = gameController.startGame(dimension,players,winningStrategies);

        gameController.printBoard(game);
    }
}