package hr.bojan.zadatakkrizickruzic.core.model;

import lombok.Data;


/**
 * Represents a game of tic-tac-toe.
 * @author Bojan
 */
@Data
public class Game {

	private int gameId;
	private GameStatus status;
	private Player firstPlayer;
	private Player secondPlayer;
	private Player winner;
	private Cell[][] gameBoard;
	
	public Game() {
		this.gameBoard = new Cell[3][3];
		for (int row = 0; row < 3; row ++){
		    for (int col = 0; col < 3; col++){
		        this.gameBoard[row][col] = new Cell();
		    }
		}
	}
}
