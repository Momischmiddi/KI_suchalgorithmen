package com.slohrsh.eighpuzzle.searchable;

import java.util.Arrays;

import com.slohrsh.interfaces.IHeuristic;
import com.slohrsh.interfaces.INode;

public class Node implements INode
{
	private int[] state;
	private int cost;
	private INode parent;
	private int depth;

	public Node(int[] state)
	{
		this.state = state;
	}

	public int getDepth()
	{
		return depth;
	}

	public Node(int[] state, INode parentNode)
	{
		this.state = state;
		this.parent = parentNode;
		this.depth = parentNode.getDepth() + 1;
	}

	public boolean isGoalReached(INode goal)
	{
		return Arrays.equals(state, goal.getState());
	}

	public Integer getCost()
	{
		return cost;
	}

	public void calculateCost(IHeuristic heuristic)
	{
		cost = heuristic.calculateCosts(state) + depth;
	}

	public int[] getState()
	{
		return state;
	}

	public void setState(int[] state)
	{
		this.state = state;
	}

	public void setParent(INode parent)
	{
		this.parent = parent;
	}

	public INode getParent()
	{
		return parent;
	}

	public String toString()
	{
		return Arrays.toString(state);
	}

	private void printNode(INode node)
	{
		StringBuilder printableState = new StringBuilder();
		int[] state = node.getState();
		printableState.append(state[0]);
		printableState.append(" ");
		printableState.append(state[1]);
		printableState.append(" ");
		printableState.append(state[2]);
		printableState.append("\n");
		printableState.append(state[3]);
		printableState.append(" ");
		printableState.append(state[4]);
		printableState.append(" ");
		printableState.append(state[5]);
		printableState.append("\n");
		printableState.append(state[6]);
		printableState.append(" ");
		printableState.append(state[7]);
		printableState.append(" ");
		printableState.append(state[8]);
		printableState.append("\n");
		System.out.println(printableState.toString());
	}

	public void printAllSuperiors()
	{
		INode resultNode = this;
		while (resultNode.getParent() != null)
		{
			printNode(resultNode);
			resultNode = resultNode.getParent();
		}
		printNode(resultNode);
	}
}
