package com.slohrsh.eightpuzzle.logic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EightPuzzleLogicMoveInvalid
{
	private IEightPuzzleLogic logic = new EightPuzzleLogic();
	
	@Test
	public void moveLeftHoleIndex2()
	{
		int[] newState = logic.moveLeft(new int[]{ 2, 1, 0, 3, 4, 5, 6, 7, 8 });
		assertEquals(null, newState);
	}
	
	@Test
	public void moveLeftHoleIndex5()
	{
		int[] newState = logic.moveLeft(new int[]{ 2, 1, 5, 3, 4, 0, 6, 7, 8 });
		assertEquals(null, newState);
	}
	
	@Test
	public void moveLeftHoleIndex8()
	{
		int[] newState = logic.moveLeft(new int[]{ 2, 1, 5, 3, 4, 8, 6, 7, 0 });
		assertEquals(null, newState);
	}
	
	@Test
	public void moveRightHoleIndex0()
	{
		int[] newState = logic.moveRight(new int[]{ 0, 1, 5, 3, 4, 8, 6, 7, 2 });
		assertEquals(null, newState);
	}
	
	@Test
	public void moveRightHoleIndex3()
	{
		int[] newState = logic.moveRight(new int[]{ 3, 1, 5, 0, 4, 8, 6, 7, 2 });
		assertEquals(null, newState);
	}
	
	@Test
	public void moveRightHoleIndex6()
	{
		int[] newState = logic.moveRight(new int[]{ 3, 1, 5, 6, 4, 8, 0, 7, 2 });
		assertEquals(null, newState);
	}
	
	@Test
	public void moveUpwardsHoleIndex6()
	{
		int[] newState = logic.moveUp(new int[]{ 3, 1, 5, 6, 4, 8, 0, 7, 2 });
		assertEquals(null, newState);
	}
	
	@Test
	public void moveUpwardsHoleIndex7()
	{
		int[] newState = logic.moveUp(new int[]{ 2, 1, 5, 3, 4, 8, 6, 0, 7 });
		assertEquals(null, newState);
	}
	
	@Test
	public void moveUpwardsHoleIndex8()
	{
		int[] newState = logic.moveUp(new int[]{ 2, 1, 5, 3, 4, 8, 6, 7, 0 });
		assertEquals(null, newState);
	}
	
	@Test
	public void moveDownwardsHoleIndex0()
	{
		int[] newState = logic.moveDown(new int[]{ 0, 1, 5, 3, 4, 8, 6, 7, 2 });
		assertEquals(null, newState);
	}
	
	@Test
	public void moveDownwardsHoleIndex1()
	{
		int[] newState = logic.moveDown(new int[]{ 1, 0, 5, 3, 4, 8, 6, 7, 2 });
		assertEquals(null, newState);
	}
	
	@Test
	public void moveDownwardsHoleIndex2()
	{
		int[] newState = logic.moveDown(new int[]{ 1, 5, 0, 3, 4, 8, 6, 7, 2 });
		assertEquals(null, newState);
	}
}
