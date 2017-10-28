package com.slohrsh.searchalgorithm;

import java.util.List;

import org.junit.Test;

import com.slohrsh.eighpuzzle.searchable.EigthPuzzleSearchable;
import com.slohrsh.eighpuzzle.searchable.Node;
import com.slohrsh.interfaces.IExecutable;
import com.slohrsh.interfaces.INode;
import com.slohrsh.searchalgorithm.depthfirstsearch.DepthFirstSearch;
import com.slohrsh.searchalgorithm.depthfirstsearch.IterativeDeepening;
import com.slohrsh.util.ArrayList;

public class DepthFirstSearchTest extends SearchTest
{

	private final INode goal = new Node(new int[]
	{ 1, 2, 3, 4, 5, 6, 7, 8, 0 });
	private INode startNode = new Node(new int[]
	{ 2, 0, 4, 6, 7, 1, 8, 5, 3 });

	@Test
	public void DepthFirstSearch()
	{
		IExecutable search = new DepthFirstSearch(EigthPuzzleSearchable.getInstance());
		List<INode> startNodeList = new ArrayList<INode>();
		startNodeList.add(startNode);
		INode resultNode = search.startSearch(startNodeList, goal);
		checkResult(resultNode);
	}

	@Test
	public void IterativeDeepening()
	{
		IExecutable search = new IterativeDeepening(EigthPuzzleSearchable.getInstance());
		List<INode> startNodeList = new ArrayList<INode>();
		startNodeList.add(startNode);
		INode resultNode = search.startSearch(startNodeList, goal);
		checkResult(resultNode);
	}

}
