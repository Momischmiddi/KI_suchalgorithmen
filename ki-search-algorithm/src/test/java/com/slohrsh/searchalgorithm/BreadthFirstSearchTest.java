package com.slohrsh.searchalgorithm;

import java.util.List;

import org.junit.Test;

import com.slohrsh.eighpuzzle.searchable.EigthPuzzleSearchable;
import com.slohrsh.eighpuzzle.searchable.Node;
import com.slohrsh.interfaces.IExecutable;
import com.slohrsh.interfaces.INode;
import com.slohrsh.searchalgorithm.breadthfirstsearch.BreadthFirstSearch;
import com.slohrsh.util.ArrayList;

public class BreadthFirstSearchTest extends SearchTest
{

	private IExecutable search = new BreadthFirstSearch(EigthPuzzleSearchable.getInstance());
	private final INode goal = new Node(new int[]
	{ 1, 2, 3, 4, 5, 6, 7, 8, 0 });
	private INode startNode = new Node(new int[]
	{ 2, 0, 4, 6, 7, 1, 8, 5, 3 });

	@Test
	public void test()
	{
		List<INode> startNodeList = new ArrayList<INode>();
		startNodeList.add(startNode);
		INode resultNode = search.startSearch(startNodeList, goal);
		checkResult(resultNode);
	}

}
