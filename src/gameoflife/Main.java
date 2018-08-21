package gameoflife;

public class Main {

	public static void main(String[] args) {
		Game g = new Game();
		for (int a = 1; a <= 200; a++) {
			int i = (int) Math.floor(Math.random() * 20);
			int j = (int) Math.floor(Math.random() * 20);
			g.changeCellLife(i, j);
		}
		g.gameStart();
	}

}
