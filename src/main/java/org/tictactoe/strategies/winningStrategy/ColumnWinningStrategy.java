package org.tictactoe.strategies.winningStrategy;

import org.tictactoe.models.Board;
import org.tictactoe.models.Move;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy{
    private final Map<Integer, HashMap<Character,Integer>> columnMaps = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int column = move.getCell().getCol();
        Character aChar = move.getPlayer().getSymbol().getaChar();

        if(!columnMaps.containsKey(column)){
            columnMaps.put(column,new HashMap<>());
        }

        Map<Character,Integer> currColumnMap = columnMaps.get(column);

        if(!currColumnMap.containsKey(aChar)){
            currColumnMap.put(aChar,0);
        }
        currColumnMap.put(aChar,currColumnMap.get(aChar) + 1);
        return currColumnMap.get(aChar).equals(board.getDimension());
    }
}
