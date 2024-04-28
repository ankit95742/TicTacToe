package org.tictactoe.controllers;

import org.tictactoe.models.Board;
import org.tictactoe.models.Game;
import org.tictactoe.models.Player;
import org.tictactoe.strategies.winningStrategy.WinningStrategy;

import java.util.List;

public class GameController {

    public Game startGame(int dimension, List<Player> players, List<WinningStrategy> winningStrategies){
        return Game.getBuilder().setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void printBoard(Game game){
        game.printBoard();
    }
}
