package com.slohrsh.eightpuzzle.logic;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class EightPuzzleLogicMoveRightTest
{
	private IEightPuzzleLogic logic = new EightPuzzleLogic();
	
	@Test
	public void moveLeftHoleIndex1()
	{
		int[] expectedState = { 0, 1, 2, 3, 4, 5, 6, 7, 8  };
		int[] newState = logic.moveRight(new int[]{ 1, 0, 2, 3, 4, 5, 6, 7, 8 });
		assertArrayEquals(expectedState, newState);
	}
	
	@Test
	public void moveLeftHoleIndex2()
	{
		int[] expectedState = { 1, 0, 2, 3, 4, 5, 6, 7, 8  };
		int[] newState = logic.moveRight(new int[]{ 1, 2, 0, 3, 4, 5, 6, 7, 8 });
		assertArrayEquals(expectedState, newState);
	}

	@Test
	public void moveLeftHoleIndex4()
	{
		int[] expectedState = { 3, 1, 2, 0, 4, 5, 6, 7, 8 };
		int[] newState = logic.moveRight(new int[]{ 3, 1, 2, 4, 0, 5, 6, 7, 8 });
		assertArrayEquals(expectedState, newState);
	}
	
	@Test
	public void moveLeftHoleIndex5()
	{
		int[] expectedState = { 3, 1, 2, 4, 0, 5, 6, 7, 8 };
		int[] newState = logic.moveRight(new int[]{ 3, 1, 2, 4, 5, 0, 6, 7, 8 });
		assertArrayEquals(expectedState, newState);
	}
	
	@Test
	public void moveLeftHoleIndex7()
	{
		int[] expectedState = { 3, 1, 2, 6, 4, 5, 0, 7, 8 };
		int[] newState = logic.moveRight(new int[]{ 3, 1, 2, 6, 4, 5, 7, 0, 8 });
		assertArrayEquals(expectedState, newState);
	}
	
	@Test
	public void moveLeftHoleIndex8()
	{
		int[] expectedState = { 3, 1, 2, 6, 4, 5, 7, 0, 8 };
		int[] newState = logic.moveRight(new int[]{ 3, 1, 2, 6, 4, 5, 7, 8, 0 });
		assertArrayEquals(expectedState, newState);
	}
	
}
