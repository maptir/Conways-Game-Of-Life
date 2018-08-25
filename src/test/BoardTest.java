package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import gameoflife.Board;

/**
 * Test the Board class.
 * @author Sathira Kittisukmongkol 5910545868
 * 			Archawin Tirugsapun 5910545892
 */
public class BoardTest {

	private Board board;

	@Before
	public void setup() {
		board = new Board(20);
	}

	@Test
	public void testBoardSize() {
		assertEquals(400, board.getSizeOfAllBoard());
	}

}
