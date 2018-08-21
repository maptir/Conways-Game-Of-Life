package gameoflife;

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
