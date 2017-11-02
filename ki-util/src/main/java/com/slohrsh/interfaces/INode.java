package com.slohrsh.interfaces;

public interface INode
{
	public boolean isGoalReached(INode goal);
	
	public Integer getCost();
	
	public void calculateCost(IHeuristic heuristic);
	
	public int[] getState();
	
	public void setState(int[] state);
	
	public void setParent(INode parent);
	
	public INode getParent();
	
	public int getDepth();
	
	public String toString();
	
	public void printAllSuperiors();
	
}
