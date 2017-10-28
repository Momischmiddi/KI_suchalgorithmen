package com.slohrsh.eightpuzzle.searchable;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.slohrsh.eighpuzzle.searchable.EigthPuzzleSearchable;
import com.slohrsh.eighpuzzle.searchable.Node;
import com.slohrsh.interfaces.INode;

public class EightPuzzleSearchableGetNodes
{
	private EigthPuzzleSearchable search = EigthPuzzleSearchable.getInstance();

	@Test
	public void getAllPossibleMovesAtHoleindex0()
	{
		List<INode> newStates = search.getSuccessors(new Node(new int[]
		{ 0, 1, 5, 3, 4, 8, 6, 7, 2 }));
		assertEquals(2, newStates.size());
	}
	
	@Test
	public void getAllPossibleMovesAtHoleindex1()
	{
		List<INode> newStates = search.getSuccessors(new Node(new int[]
		{ 1, 0, 5, 3, 4, 8, 6, 7, 2 }));
		assertEquals(3, newStates.size());
	}
	
	@Test
	public void getAllPossibleMovesAtHoleindex2()
	{
		List<INode> newStates = search.getSuccessors(new Node(new int[]
		{ 1, 5, 0, 3, 4, 8, 6, 7, 2 }));
		assertEquals(2, newStates.size());
	}
	
	@Test
	public void getAllPossibleMovesAtHoleindex3()
	{
		List<INode> newStates = search.getSuccessors(new Node(new int[]
		{ 1, 5, 3, 0, 4, 8, 6, 7, 2 }));
		assertEquals(3, newStates.size());
	}
	
	@Test
	public void getAllPossibleMovesAtHoleindex4()
	{
		List<INode> newStates = search.getSuccessors(new Node(new int[]
		{ 1, 5, 3, 4, 0, 8, 6, 7, 2 }));
		assertEquals(4, newStates.size());
	}
	
	@Test
	public void getAllPossibleMovesAtHoleindex5()
	{
		List<INode> newStates = search.getSuccessors(new Node(new int[]
		{ 1, 5, 3, 4, 8, 0, 6, 7, 2 }));
		assertEquals(3, newStates.size());
	}
	
	@Test
	public void getAllPossibleMovesAtHoleindex6()
	{
		List<INode> newStates = search.getSuccessors(new Node(new int[]
		{ 1, 5, 3, 4, 8, 6, 0, 7, 2 }));
		assertEquals(2, newStates.size());
	}
	
	@Test
	public void getAllPossibleMovesAtHoleindex7()
	{
		List<INode> newStates = search.getSuccessors(new Node(new int[]
		{ 1, 5, 3, 4, 8, 6, 7, 0, 2 }));
		assertEquals(3, newStates.size());
	}
	
	@Test
	public void getAllPossibleMovesAtHoleindex8()
	{
		List<INode> newStates = search.getSuccessors(new Node(new int[]
		{ 2, 1, 5, 3, 4, 8, 6, 7, 0 }));
		assertEquals(2, newStates.size());
	}

}
