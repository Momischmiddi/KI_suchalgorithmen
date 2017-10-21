package com.slohrsh.eighpuzzle.searchable;

import com.slohrsh.interfaces.ISearchable;

import com.slohrsh.util.ArrayList;
import java.util.List;

import com.slohrsh.eightpuzzle.logic.EightPuzzleLogic;
import com.slohrsh.eightpuzzle.logic.IEightPuzzleLogic;

public class EigthPuzzleSearchable implements ISearchable
{
	private IEightPuzzleLogic logic = new EightPuzzleLogic();

	private static EigthPuzzleSearchable instance = new EigthPuzzleSearchable();

	private EigthPuzzleSearchable()
	{
	}

	public static EigthPuzzleSearchable getInstance()
	{
		return instance;
	}

	public List<int[]> getAllPossibleMoves(int[] actualState)
	{
		List<int[]> allPossibleMovements = new ArrayList<int[]>();

		allPossibleMovements.add(logic.moveUp(actualState));
		allPossibleMovements.add(logic.moveDown(actualState));
		allPossibleMovements.add(logic.moveRight(actualState));
		allPossibleMovements.add(logic.moveLeft(actualState));

		return allPossibleMovements;
	}
}
