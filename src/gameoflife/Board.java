package gameoflife;

/**
 * The board will contain many Cells 
 * and it can find the neighbors of each cell.
 * @author Sathira Kittisukmongkol 5910545868
 * 			Archawin Tirugsapun 5910545892
 */
public class Board {

	private Cell[][] cellsBoard;

	public Board(int size) {
		cellsBoard = new Cell[size][size];
		for (int row = 0; row < cellsBoard[0].length; row++) {
			for (int column = 0; column < cellsBoard.length; column++) {
				cellsBoard[row][column] = new Cell();
			}
		}
	}

	public int countNeighbors(int inputX, int inputY) {
		int count = 0;
		for (int row = inputX - 1; row < inputX + 2; row++) {
			for (int column = inputY - 1; column < inputY + 2; column++) {
				if ((row == inputX && column == inputY) || exceedNegative(row) || exceedNegative(column) || exceedPositive(row)
						|| exceedPositive(column)) {

					if (row == inputX && column == inputY)
						continue;

					Integer tempRowValue = new Integer(row);
					Integer tempColumnValue = new Integer(column);

					if (exceedNegative(row))
						row += getSizeOfOneSide();
					if (exceedPositive(row))
						row -= getSizeOfOneSide();
					if (exceedNegative(column))
						column += getSizeOfOneSide();
					if (exceedPositive(column))
						column -= getSizeOfOneSide();

					if (cellsBoard[row][column].isAlive())
						count++;

					row = tempRowValue;
					column = tempColumnValue;
					continue;
				}
				if (cellsBoard[row][column].isAlive()) {
					count++;
				}
			}
		}
		return count;
	}

	public boolean exceedNegative(int num) {
		return (num < 0);
	}
	
	public boolean exceedPositive(int num) {
		return (num >= cellsBoard.length);
	}

	public void printBoard() {
		for (int row = 0; row < cellsBoard[0].length; row++) {
			for (int column = 0; column < cellsBoard.length; column++) {
				System.out.print(cellsBoard[row][column] + " ");
			}
			System.out.println();
		}
	}

	public int getSizeOfAllBoard() {
		return cellsBoard.length * cellsBoard.length;
	}

	public int getSizeOfOneSide() {
		return cellsBoard.length;
	}

	public Cell getCell(int posX, int posY) {
		return cellsBoard[posX][posY];
	}

}
