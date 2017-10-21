package com.slohrsh.eightpuzzle.logic;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class EightPuzzleLogicMoveDownwardsTest
{
	private IEightPuzzleLogic logic = new EightPuzzleLogic();
	
	@Test
	public void moveDownwardsHoleIndex3()
	{
		int[] expectedState = { 0, 2, 3, 1, 5, 7, 4, 8, 6 };
		int[] newState = logic.moveDown(new int[]{ 1, 2, 3, 0, 5, 7, 4, 8, 6 });
		assertArrayEquals(expectedState, newState);
	}
	
	@Test
	public void moveDownwardsHoleIndex4()
	{
		int[] expectedState = { 1, 0, 3, 5, 2, 7, 4, 8, 6 };
		int[] newState = logic.moveDown(new int[]{ 1, 2, 3, 5, 0, 7, 4, 8, 6 });
		assertArrayEquals(expectedState, newState);
	}
	
	@Test
	public void moveDownwardsHoleIndex5()
	{
		int[] expectedState = { 1, 2, 0, 7, 5, 3, 4, 8, 6 };
		int[] newState = logic.moveDown(new int[]{ 1, 2, 3, 7, 5, 0, 4, 8, 6 });
		assertArrayEquals(expectedState, newState);
	}
	
	@Test
	public void moveDownwardsHoleIndex6()
	{
		int[] expectedState = { 1, 2, 3, 0, 5, 7, 4, 8, 6 };
		int[] newState = logic.moveDown(new int[]{ 1, 2, 3, 4, 5, 7, 0, 8, 6 });
		assertArrayEquals(expectedState, newState);
	}
	
	@Test
	public void moveDownwardsHoleIndex7()
	{
		int[] expectedState = { 1, 2, 3, 8, 0, 7, 4, 5, 6 };
		int[] newState = logic.moveDown(new int[]{ 1, 2, 3, 8, 5, 7, 4, 0, 6 });
		assertArrayEquals(expectedState, newState);
	}
	
	@Test
	public void moveDownwardsHoleIndex8()
	{
		int[] expectedState = { 1, 2, 3, 6, 5, 0, 4, 8, 7 };
		int[] newState = logic.moveDown(new int[]{ 1, 2, 3, 6, 5, 7, 4, 8, 0 });
		assertArrayEquals(expectedState, newState);
	}

}
