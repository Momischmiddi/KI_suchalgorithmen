package com.slohrsh.eightpuzzle.logic;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class EightPuzzleLogicMoveUpwardsTest
{
	private IEightPuzzleLogic logic = new EightPuzzleLogic();
	
	@Test
	public void moveUpwardsHoleIndex0()
	{
		int[] expectedState = { 6, 2, 3, 0, 5, 7, 4, 8, 1 };
		int[] newState = logic.moveUp(new int[]{ 0, 2, 3, 6, 5, 7, 4, 8, 1 });
		assertArrayEquals(expectedState, newState);
	}
	@Test
	public void moveUpwardsHoleIndex1()
	{
		int[] expectedState = { 1, 5, 3, 2, 0, 7, 4, 8, 6 };
		int[] newState = logic.moveUp(new int[]{ 1, 0, 3, 2, 5, 7, 4, 8, 6 });
		assertArrayEquals(expectedState, newState);
	}
	
	@Test
	public void moveUpwardsHoleIndex2()
	{
		int[] expectedState = { 1, 2, 7, 5, 3, 0, 4, 8, 6 };
		int[] newState = logic.moveUp(new int[]{ 1, 2, 0, 5, 3, 7, 4, 8, 6 });
		assertArrayEquals(expectedState, newState);
	}
	
	@Test
	public void moveUpwardsHoleIndex3()
	{
		int[] expectedState = { 1, 2, 3, 4, 5, 7, 0, 8, 6 };
		int[] newState = logic.moveUp(new int[]{ 1, 2, 3, 0, 5, 7, 4, 8, 6 });
		assertArrayEquals(expectedState, newState);
	}
	
	@Test
	public void moveUpwardsHoleIndex4()
	{
		int[] expectedState = { 1, 2, 3, 4, 8, 7, 5, 0, 6 };
		int[] newState = logic.moveUp(new int[]{ 1, 2, 3, 4, 0, 7, 5, 8, 6 });
		assertArrayEquals(expectedState, newState);
	}
	
	@Test
	public void moveUpwardsHoleIndex5()
	{
		int[] expectedState = { 1, 2, 3, 8, 5, 6, 4, 7, 0 };
		int[] newState = logic.moveUp(new int[]{ 1, 2, 3, 8, 5, 0, 4, 7, 6 });
		assertArrayEquals(expectedState, newState);
	}

}
