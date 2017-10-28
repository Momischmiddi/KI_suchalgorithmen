package com.slohrsh.searchalgorithm.depthfirstsearch;

import java.util.List;

import com.slohrsh.interfaces.IExecutable;
import com.slohrsh.interfaces.INode;
import com.slohrsh.interfaces.ISearchable;
import com.slohrsh.searchalgorithm.Searchalgorithm;
import com.slohrsh.util.ArrayList;

public class IterativeDeepening extends Searchalgorithm implements IExecutable
{

	private ISearchable logic;
	
	public IterativeDeepening(ISearchable logic)
	{
		this.logic = logic;
	}

	public INode startSearch(List<INode> parentNodes, INode goal)
	{
		return iterativeDeepening(parentNodes.get(0), goal);
	}

	private INode iterativeDeepening(INode parentNode, INode goal)
	{
		INode resultNode = null;
		int limit = 0;
		while (resultNode == null)
		{
			System.out.println(limit);
			avoidCycle.clear();
			resultNode = depthFirstSearch(parentNode, goal, 0, limit);
			limit++;
		}
		return resultNode;
	}

	private INode depthFirstSearch(INode parentNode, INode goal, int depth, int limit)
	{
		if (parentNode.isGoalReached(goal))
		{
			return parentNode;
		}
		List<INode> newNodes = new ArrayList<INode>();

		newNodes.addAll(addWithoutDuplicates(logic.getSuccessors(parentNode)));

		while (!newNodes.isEmpty() && (depth <= limit))
		{
			INode result = depthFirstSearch(newNodes.remove(0), goal, ++depth, limit);
			if (result != null)
			{
				return result;
			}
		}
		return null;
	}

}
