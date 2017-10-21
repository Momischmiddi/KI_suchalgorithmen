package com.slohrsh.eightpuzzle.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class EightPuzzleLogic implements IEightPuzzleLogic
{

	private static final Set<Object> NULL_OBJECT = Collections.singleton(null);
	private static final int PUZZLE_SIZE = 9;

	public int[] moveUp(int[] state)
	{
		return moveIfPossible(state, Movement.UP);
	}

	public int[] moveDown(int[] state)
	{
		return moveIfPossible(state, Movement.DOWN);
	}

	public int[] moveLeft(int[] state)
	{
		return moveIfPossible(state, Movement.LEFT);
	}

	public int[] moveRight(int[] state)
	{
		return moveIfPossible(state, Movement.RIGHT);
	}

	private int[] moveIfPossible(int[] state, Movement movement)
	{
		int holeIndex = getHoleIndex(state);
		int counterpartIndex = getCounterpartIndex(holeIndex, movement);
		
		if(counterpartIndex != -1) {
			return swap(state, holeIndex, counterpartIndex);
		}
		return null;
	}

	private int getCounterpartIndex(int holeIndex, Movement movement)
	{
		switch (movement)
		{
		case UP:
			if (holeIndex <= 5)
			{
				return holeIndex + 3;
			}
			break;
		case DOWN:
			if (holeIndex >= 3)
			{
				return holeIndex - 3;
			}
			break;
		case LEFT:
			if (holeIndex == 0 || holeIndex == 3 || holeIndex == 6 ||holeIndex == 1 || holeIndex == 4 || holeIndex == 7)
			{
				return holeIndex + 1;
			}
			break;
		case RIGHT:
			if (holeIndex == 1 || holeIndex == 4 || holeIndex == 7 || holeIndex == 2 || holeIndex == 5 || holeIndex == 8)
			{
				return holeIndex - 1;
			}
			break;
		}
		return -1;
	}

	private int[] swap(int[] state, int holeIndex, int counterpartIndex)
	{
		int[] newState = state.clone();
		newState[holeIndex] = newState[counterpartIndex];
		newState[counterpartIndex] = 0;
		return newState;
	}

	private int getHoleIndex(int[] state)
	{
		int holeIndex = -1;

		for (int i = 0; i < PUZZLE_SIZE; i++)
		{
			if (state[i] == 0)
				holeIndex = i;
		}
		return holeIndex;
	}

	private enum Movement
	{
		UP, DOWN, LEFT, RIGHT
	}

}
