package com.slohrsh.searchalgorithm.heuristicsearch;

import java.util.Comparator;
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
	
	Comparator<INode> c = new Comparator<INode>() {

		@Override
		public int compare(INode o1, INode o2)
		{
			return o1.getCost().compareTo(o2.getCost());
		}
		
	};
	

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
		allNodes.add(ratedNode);
		//More performant because if you search for an index and then shift it, it would be O(1/n) + O(n)
		allNodes.sort(c); //-> O(n * log n)
	}
}
