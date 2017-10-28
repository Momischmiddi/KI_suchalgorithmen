package com.slohrsh.searchalgorithm.heuristicsearch;

import java.util.List;

import com.slohrsh.interfaces.IExecutable;
import com.slohrsh.interfaces.IHeuristic;
import com.slohrsh.interfaces.INode;
import com.slohrsh.interfaces.ISearchable;
import com.slohrsh.searchalgorithm.Searchalgorithm;
import com.slohrsh.util.ArrayList;


public class HeuristicSearch extends Searchalgorithm implements IExecutable
{

	private ISearchable logic;
	private IHeuristic heuristic;
	

	public HeuristicSearch(ISearchable logic, IHeuristic heuristic)
	{
		this.logic = logic;
		this.heuristic = heuristic;
	}

	public INode startSearch(List<INode> parentNode, INode goal)
	{
		List<INode> allNodes = sortIn(parentNode, new ArrayList<INode>());
		return heuristicSearch(allNodes, goal);
	}

	public INode heuristicSearch(List<INode> start, INode goal)
	{
		while (!start.isEmpty())
		{
			INode node = start.remove(0);
			if (node.isGoalReached(goal))
			{
				return node;
			}
			start = sortIn(logic.getSuccessors(node), start);
		}
		return null;
	}

	private List<INode> sortIn(List<INode> successors, List<INode> allNodes)
	{
		for (INode node : successors)
		{
			if(avoidCycle.add(node.toString()))
			{
				node.calculateCost(heuristic);
				sortInArray(node, allNodes);
			}
		}
		return allNodes;
	}

	private void sortInArray(INode ratedNode, List<INode> allNodes)
	{
		int size = allNodes.size();
		for(int i = 0; i < size; i++)
		{
			if(ratedNode.getCost() < allNodes.get(i).getCost())
			{
				allNodes.add(i, ratedNode);
				return;
			}
		}
		allNodes.add(ratedNode);
		
	}
}
