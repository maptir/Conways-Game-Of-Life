package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import gameoflife.Game;

/**
 * Test the Game class.
 * @author Sathira Kittisukmongkol 5910545868
 * 			Archawin Tirugsapun 5910545892
 */
public class GameTest {

	private Game game;

	@Before
	public void setup() {
		game = new Game();
	}

	@Test
	public void testOneCell() {
		game.changeCellLife(5, 5);
		game.gameLogic();
		assertEquals(game.getBoard().getCell(5, 5).isAlive(), false);
	}
	
	@Test
	public void testOneCellCrazy() {
		game.changeCellLife(5, 5);
		game.changeCellLife(5, 5);
		game.gameLogic();
		assertEquals(game.getBoard().getCell(5, 5).isAlive(), false);
	}
	
	@Test
	public void testStillLifesBlock() {
		game.changeCellLife(2, 4);
		game.changeCellLife(2, 5);
		game.changeCellLife(3, 4);
		game.changeCellLife(3, 5);
		game.gameLogic();
		assertEquals(game.getBoard().getCell(2, 4).isAlive(), true);
		assertEquals(game.getBoard().getCell(2, 5).isAlive(), true);
		assertEquals(game.getBoard().getCell(3, 4).isAlive(), true);
		assertEquals(game.getBoard().getCell(3, 5).isAlive(), true);
	}
	
	@Test
	public void testStillLifesBeehive() {
		game.changeCellLife(3, 4);
		game.changeCellLife(3, 5);
		game.changeCellLife(4, 3);
		game.changeCellLife(4, 6);
		game.changeCellLife(5, 4);
		game.changeCellLife(5, 5);
		game.gameLogic();
		assertEquals(game.getBoard().getCell(3, 4).isAlive(), true);
		assertEquals(game.getBoard().getCell(3, 5).isAlive(), true);
		assertEquals(game.getBoard().getCell(4, 3).isAlive(), true);
		assertEquals(game.getBoard().getCell(4, 6).isAlive(), true);
		assertEquals(game.getBoard().getCell(5, 4).isAlive(), true);
		assertEquals(game.getBoard().getCell(5, 5).isAlive(), true);
	}
	
	@Test
	public void testStillLifesTub() {
		game.changeCellLife(3, 4);
		game.changeCellLife(4, 3);
		game.changeCellLife(4, 5);
		game.changeCellLife(5, 4);
		game.gameLogic();
		assertEquals(game.getBoard().getCell(3, 4).isAlive(), true);
		assertEquals(game.getBoard().getCell(4, 3).isAlive(), true);
		assertEquals(game.getBoard().getCell(4, 5).isAlive(), true);
		assertEquals(game.getBoard().getCell(5, 4).isAlive(), true);
	}
	
	@Test
	public void testOscillatorsBlinker() {
		game.changeCellLife(3, 5);
		game.changeCellLife(4, 5);
		game.changeCellLife(5, 5);
		game.gameLogic();
		assertEquals(game.getBoard().getCell(4, 4).isAlive(), true);
		assertEquals(game.getBoard().getCell(4, 5).isAlive(), true);
		assertEquals(game.getBoard().getCell(4, 6).isAlive(), true);
		assertEquals(game.getBoard().getCell(3, 5).isAlive(), false);
		assertEquals(game.getBoard().getCell(5, 5).isAlive(), false);
	}
	
	@Test
	public void testOscillatorsToad() {
		game.changeCellLife(3, 3);
		game.changeCellLife(3, 4);
		game.changeCellLife(3, 5);
		game.changeCellLife(3, 6);
		game.changeCellLife(4, 2);
		game.changeCellLife(4, 3);
		game.changeCellLife(4, 4);
		game.changeCellLife(4, 5);
		game.gameLogic();
		assertEquals(game.getBoard().getCell(2, 5).isAlive(), true);
		assertEquals(game.getBoard().getCell(3, 2).isAlive(), true);
		assertEquals(game.getBoard().getCell(3, 3).isAlive(), false);
		assertEquals(game.getBoard().getCell(3, 4).isAlive(), false);
		assertEquals(game.getBoard().getCell(3, 5).isAlive(), false);
		assertEquals(game.getBoard().getCell(3, 6).isAlive(), true);
		assertEquals(game.getBoard().getCell(4, 2).isAlive(), true);
		assertEquals(game.getBoard().getCell(4, 3).isAlive(), false);
		assertEquals(game.getBoard().getCell(4, 4).isAlive(), false);
		assertEquals(game.getBoard().getCell(4, 5).isAlive(), false);
		assertEquals(game.getBoard().getCell(4, 6).isAlive(), true);
		assertEquals(game.getBoard().getCell(5, 3).isAlive(), true);
	}
	
	@Test
	public void testOscillatorsBeacon() {
		game.changeCellLife(2, 4);
		game.changeCellLife(2, 5);
		game.changeCellLife(3, 4);
		game.changeCellLife(4, 7);
		game.changeCellLife(5, 6);
		game.changeCellLife(5, 7);
		game.gameLogic();
		assertEquals(game.getBoard().getCell(2, 4).isAlive(), true);
		assertEquals(game.getBoard().getCell(2, 5).isAlive(), true);
		assertEquals(game.getBoard().getCell(3, 4).isAlive(), true);
		assertEquals(game.getBoard().getCell(4, 7).isAlive(), true);
		assertEquals(game.getBoard().getCell(5, 6).isAlive(), true);
		assertEquals(game.getBoard().getCell(5, 7).isAlive(), true);
		assertEquals(game.getBoard().getCell(3, 5).isAlive(), true);
		assertEquals(game.getBoard().getCell(4, 6).isAlive(), true);
		
	}
}
