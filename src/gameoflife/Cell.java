package gameoflife;

/**
 * Cell is a single cell in the board
 * Have only 2 status : alive or dead.
 * @author Sathira Kittisukmongkol 5910545868
 * 			Archawin Tirugsapun 5910545892
 */
public class Cell {

	private boolean alive;

	public Cell() {
		alive = false;
	}

	public boolean isAlive() {
		return alive;
	}

	public void changeLife() {
		alive = !alive;
	}

	@Override
	public String toString() {
		return alive ? "X" : ".";
	}

}
