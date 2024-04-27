package org.tictactoe.strategies.winningStrategy;

import org.tictactoe.models.Board;
import org.tictactoe.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
}
