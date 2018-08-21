package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import gameoflife.Cell;

public class CellTest {

	private Cell cell;
	
	@Before
	public void setup() {
		cell = new Cell();
	}
	
	@Test
	public void testAliveCell() {
		assertEquals(false, cell.isAlive());
	}
	
}
