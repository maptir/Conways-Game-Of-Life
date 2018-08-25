package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import gameoflife.Cell;

/**
 * Test the Cell class.
 * @author Sathira Kittisukmongkol 5910545868
 * 			Archawin Tirugsapun 5910545892
 */
public class CellTest {

	private Cell cell;
	
	@Before
	public void setup() {
		cell = new Cell();
	}
	
	@Test
	public void testAliveCell() {
		cell.changeLife();
		assertEquals(true, cell.isAlive());
	}
	
	@Test
	public void testDeadCell() {
		assertEquals(false, cell.isAlive());
	}
	
	@Test
	public void testChangeCellStatus() {
		assertEquals(false, cell.isAlive());
		cell.changeLife();
		assertEquals(true, cell.isAlive());
		cell.changeLife();
		assertEquals(false, cell.isAlive());
		cell.changeLife();
		assertEquals(true, cell.isAlive());
	}
	
}
