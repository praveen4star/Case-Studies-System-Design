package TicTacToe.models;

import TicTacToe.strategies.winningStrategies.WinningStrategies;

import java.util.List;

public class Game {
    private GameState gameState;
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private int nextMovePlayerIndex;
    private Player winner;

    private List<WinningStrategies> winningStrategies;

}
