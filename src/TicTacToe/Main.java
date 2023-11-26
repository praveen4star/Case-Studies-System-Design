package TicTacToe;

import TicTacToe.controllers.GameController;
import TicTacToe.models.GameState;
import TicTacToe.models.Game;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.startGame();
        Game game = new Game();
        while(gameController.checkGameState(game).equals(GameState.IN_PROGRESS)){
            gameController.displayBoard(game);
            gameController.makeMove(game);
        }
        if(gameController.checkGameState(game).equals(GameState.SUCCESS)){
            System.out.println(gameController.getWinner(game).getName());
        }
        else{
            System.out.println("Game is State :"+ gameController.checkGameState(game));
        }
    }
}
