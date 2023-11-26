package TicTacToe.controllers;

import TicTacToe.models.Game;
import TicTacToe.models.GameState;
import TicTacToe.models.Player;
public class GameController {
    public GameController(){

    }
    public void startGame(){

    }

    public void makeMove(Game game){}
    public  void displayBoard(Game game){}
    public  Player getWinner(Game game){
        return null;
    }
    public GameState checkGameState(Game game){
        return GameState.PAUSE;
    }
    public  void undoMove(){

    }
}
