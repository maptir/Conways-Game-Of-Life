package gameoflife;

public class Board {

	private Cell[][] cellsBoard;

	public Board(int size) {
		cellsBoard = new Cell[size][size];
		for (int i = 0; i < cellsBoard[0].length; i++) {
			for (int j = 0; j < cellsBoard.length; j++) {
				cellsBoard[i][j] = new Cell();
			}
		}
	}

	public int countNeighbors(int x, int y) {
		int count = 0;
		for (int i = x - 1; i < x + 2; i++) {
			for (int j = y - 1; j < y + 2; j++) {
				if ((i == x && j == y) || i < 0 || j < 0 || i >= cellsBoard.length || j >= cellsBoard.length)
					continue;
				if (cellsBoard[i][j].isAlive())
					count++;
			}
		}
		return count;
	}

	public void printBoard() {
		for (int i = 0; i < cellsBoard[0].length; i++) {
			for (int j = 0; j < cellsBoard.length; j++) {
				System.out.print(cellsBoard[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int getBoardSize() {
		return cellsBoard.length * cellsBoard.length;
	}

	public int getSize() {
		return cellsBoard.length;
	}

	public Cell getCell(int i, int j) {
		return cellsBoard[i][j];
	}

}
