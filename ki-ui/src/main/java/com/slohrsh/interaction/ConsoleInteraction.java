package com.slohrsh.interaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.slohrsh.eighpuzzle.searchable.EigthPuzzleSearchable;
import com.slohrsh.eighpuzzle.searchable.Node;
import com.slohrsh.eightpuzzle.heuristics.FalsePositionHeuristic;
import com.slohrsh.eightpuzzle.heuristics.ManhattanDistanceHeuristic;
import com.slohrsh.interfaces.IExecutable;
import com.slohrsh.interfaces.INode;
import com.slohrsh.searchalgorithm.breadthfirstsearch.BreadthFirstSearch;
import com.slohrsh.searchalgorithm.depthfirstsearch.DepthFirstSearch;
import com.slohrsh.searchalgorithm.depthfirstsearch.IterativeDeepening;
import com.slohrsh.searchalgorithm.heuristicsearch.HeuristicSearch;
import com.slohrsh.util.ArrayList;

public class ConsoleInteraction
{

	public static void main(String[] args) throws IOException
	{
		String input = "";
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
		while (!input.equals("q"))
		{
			input = getInput(inputReader);
			executeAlgorithm(input);
		}
		System.out.println("Program finished successfully");
	}

	private static void executeAlgorithm(String input)
	{
		INode goal = new Node(new int[]
		{ 1, 2, 3, 4, 5, 6, 7, 8, 0 });
		INode startNode = new Node(new int[]
		{ 2, 0, 4, 6, 7, 1, 8, 5, 3 });
		IExecutable search;
		switch (input)
		{
		case "bs":
			search = new BreadthFirstSearch(EigthPuzzleSearchable.getInstance());
			break;
		case "ds":
			search = new DepthFirstSearch(EigthPuzzleSearchable.getInstance());
			break;
		case "its":
			search = new IterativeDeepening(EigthPuzzleSearchable.getInstance());
			break;
		case "hs1":
			search = new HeuristicSearch(EigthPuzzleSearchable.getInstance(), new FalsePositionHeuristic());
			break;
		case "hs2":
			search = new HeuristicSearch(EigthPuzzleSearchable.getInstance(), new ManhattanDistanceHeuristic());
			break;
		case "q":
			return;
		default:
			System.out.println("invalid input");
			return;
		}
		try {
			List<INode> startNodeList = new ArrayList<INode>();
			startNodeList.add(startNode);
			INode resultNode = search.startSearch(startNodeList, goal);
			checkResult(resultNode);
		}catch(StackOverflowError e)
		{
			System.out.println("RAM ran out of memory!");
		}
		
		return;
	}

	private static String getInput(BufferedReader inputReader) throws IOException
	{
		System.out.println("Choose algorithm:");
		System.out.println("Type 'q' to quit");
		System.out.println("Breadth First Search, type: 'bs'");
		System.out.println("Depth First Search, type: 'ds'");
		System.out.println("Iteratice Deepening Search, type: 'its'");
		System.out.println("Search with heuristic h1, type: 'hs1'");
		System.out.println("Search with heuristic h2, type: 'hs2'");
		return inputReader.readLine();
	}
	
	protected static void checkResult(INode resultNode)
	{
		if(resultNode != null)
		{
			resultNode.printAllSuperiors();
		}else
		{
			System.out.println("No Result");
		}
	}
}
