package gameoflife;

import java.util.ArrayList;
import java.util.List;

/**
 * Game class will control the board and the rule of the game.
 * @author Sathira Kittisukmongkol 5910545868
 * 			Archawin Tirugsapun 5910545892
 */
public class Game {

	private Board board;

	public Game() {
		board = new Board(20);
	}

	public Game(int size) {
		board = new Board(size);
	}

	public void gameStart() {
		while (true) {
			board.printBoard();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("====================================");
			gameLogic();
		}
	}

	public void gameLogic() {
		List<Cell> cellToChange = new ArrayList<>();
		for (int row = 0; row < board.getSizeOfOneSide(); row++) {
			for (int column = 0; column < board.getSizeOfOneSide(); column++) {
				Cell cell = board.getCell(row, column);
				int neighbors = board.countNeighbors(row, column);
				if (cell.isAlive()) {
					if (aliveCellCondition(neighbors)) {
						cellToChange.add(cell);
					}
				} else {
					if (deadCellCondition(neighbors)) {
						cellToChange.add(cell);
					}
				}
			}
		}
		changeSelectedCell(cellToChange);
	}
	
	public boolean aliveCellCondition(int neighbors) {
		return (neighbors < 2 || neighbors > 3);
	}
	
	public boolean deadCellCondition(int neighbors) {
		return (neighbors == 3);
	}
	
	public void changeSelectedCell(List<Cell> listCell) {
		for (Cell cell : listCell) {
			cell.changeLife();
		}
	}

	public Board getBoard() {
		return board;
	}

	public void changeCellLife(int i, int j) {
		board.getCell(i, j).changeLife();
	}

}
