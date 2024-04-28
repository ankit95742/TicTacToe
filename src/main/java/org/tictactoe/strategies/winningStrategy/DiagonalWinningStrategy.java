package org.tictactoe.strategies.winningStrategy;

import org.tictactoe.models.Board;
import org.tictactoe.models.Move;

import java.nio.charset.IllegalCharsetNameException;
import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy{
    private final Map<Character, Integer> leftDiagonalMap = new HashMap<>();
    private final Map<Character,Integer> rightDiagonalMap = new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int column = move.getCell().getCol();
        Character aChar = move.getPlayer().getSymbol().getaChar();

        if(row == column){
            if(!leftDiagonalMap.containsKey(aChar)){
                leftDiagonalMap.put(aChar,0);
            }
            leftDiagonalMap.put(aChar,leftDiagonalMap.get(aChar) + 1);
            if(leftDiagonalMap.get(aChar).equals(board.getDimension())){
                return  true;
            }
        }

        if(row + column == board.getDimension() - 1){
            if(!rightDiagonalMap.containsKey(aChar)){
                rightDiagonalMap.put(aChar,0);
            }
            rightDiagonalMap.put(aChar,rightDiagonalMap.get(aChar)+1);
            if(rightDiagonalMap.get(aChar).equals(board.getDimension())){
                return true;
            }
        }
        return false;
    }
}
