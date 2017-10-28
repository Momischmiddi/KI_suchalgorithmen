package com.slohrsh.eighpuzzle.searchable;

import com.slohrsh.interfaces.INode;
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

	public List<INode> getSuccessors(INode parentNode)
	{
		List<INode> allPossibleMovements = new ArrayList<INode>();
		int[] actualState = parentNode.getState();
		int[] tmpState;
		
		tmpState = logic.moveUp(actualState);
		allPossibleMovements.add(tmpState != null ? new Node(tmpState, parentNode) : null);
		tmpState = logic.moveDown(actualState);
		allPossibleMovements.add(tmpState != null ? new Node(tmpState, parentNode) : null);
		tmpState = logic.moveRight(actualState);
		allPossibleMovements.add(tmpState != null ? new Node(tmpState, parentNode) : null);
		tmpState = logic.moveLeft(actualState);
		allPossibleMovements.add(tmpState != null ? new Node(tmpState, parentNode) : null);

		return allPossibleMovements;
	}
}
