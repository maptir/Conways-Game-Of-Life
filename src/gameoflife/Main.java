package gameoflife;

/**
 * Main class to run the program.
 * @author Sathira Kittisukmongkol 5910545868
 * 			Archawin Tirugsapun 5910545892
 */
public class Main {

	public static void main(String[] args) {
		Game g = new Game();
		for (int num = 1; num <= 4000; num++) {
			int row = (int) Math.floor(Math.random() * 20);
			int column = (int) Math.floor(Math.random() * 20);
			g.changeCellLife(row, column);
		}
		g.gameStart();
	}

}
