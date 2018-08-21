package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import gameoflife.Board;

public class BoardTest {

	private Board board;

	@Before
	public void setup() {
		board = new Board(8);
	}

	@Test
	public void testBoardSize() {
		assertEquals(400, board.getBoardSize());
	}

}
