package com.slohrsh.searchalgorithm.depthfirstsearch;

import java.util.List;

import com.slohrsh.interfaces.IExecutable;
import com.slohrsh.interfaces.INode;
import com.slohrsh.interfaces.ISearchable;
import com.slohrsh.searchalgorithm.Searchalgorithm;
import com.slohrsh.util.ArrayList;

public class DepthFirstSearch extends Searchalgorithm implements IExecutable
{

	private ISearchable logic;

	public DepthFirstSearch(ISearchable logic)
	{
		this.logic = logic;
	}

	public INode startSearch(List<INode> parentNodes, INode goal)
	{
		return startSearch(parentNodes.get(0), goal);
	}

	private INode startSearch(INode parentNode, INode goal)
	{
		if (parentNode.isGoalReached(goal))
		{
			return parentNode;
		}

		List<INode> newNodes = new ArrayList<INode>();

		newNodes.addAll(addWithoutDuplicates(logic.getSuccessors(parentNode)));

		while (!newNodes.isEmpty())
		{
			INode resultNode = startSearch(newNodes.remove(0), goal);
			if (resultNode != null)
			{
				return resultNode;
			}
		}
		return null;
	}

}
