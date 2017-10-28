package com.slohrsh.searchalgorithm.breadthfirstsearch;

import java.util.Collection;
import java.util.List;

import com.slohrsh.interfaces.IExecutable;
import com.slohrsh.interfaces.INode;
import com.slohrsh.interfaces.ISearchable;
import com.slohrsh.searchalgorithm.Searchalgorithm;
import com.slohrsh.util.ArrayList;

public class BreadthFirstSearch extends Searchalgorithm implements IExecutable
{

	private ISearchable logic;

	public BreadthFirstSearch(ISearchable logic)
	{
		this.logic = logic;
	}

	public INode startSearch(List<INode> parentNodes, INode goal)
	{
		List<INode> newNodes = new ArrayList<INode>();

		for (INode node : parentNodes)
		{
			if (node.isGoalReached(goal))
			{
				return node;
			}
			newNodes.addAll(addWithoutDuplicates(logic.getSuccessors(node)));
		}
		if (newNodes.size() != 0)
		{
			return startSearch(newNodes, goal);
		} else
		{
			return null;
		}
	}

}
