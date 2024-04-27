package org.tictactoe.strategies.botPlayingStrategy;

import org.tictactoe.models.Board;
import org.tictactoe.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
