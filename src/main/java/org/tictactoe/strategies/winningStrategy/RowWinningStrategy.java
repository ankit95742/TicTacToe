package org.tictactoe.strategies.winningStrategy;

import org.tictactoe.models.Board;
import org.tictactoe.models.Move;

public class RowWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
