package gameoflife;

import java.util.ArrayList;
import java.util.List;

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
			System.out.println("==================");
			gameLogic();
		}
	}

	public void gameLogic() {
		List<Cell> tempCells = new ArrayList<>();
		for (int i = 0; i < board.getSize(); i++) {
			for (int j = 0; j < board.getSize(); j++) {
				Cell cell = board.getCell(i, j);
				int neighbors = board.countNeighbors(i, j);
				if (cell.isAlive()) {
					if (neighbors < 2 || neighbors > 3) {
						tempCells.add(cell);
					}
				} else {
					if (neighbors == 3) {
						tempCells.add(cell);
					}
				}
			}
		}
		for (Cell cell : tempCells) {
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
