package com.slohrsh.searchalgorithm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.slohrsh.interfaces.INode;
import com.slohrsh.util.ArrayList;

public abstract class Searchalgorithm
{
	protected Set<String> avoidCycle = new HashSet<String>();
	
	protected List<INode> addWithoutDuplicates(List<INode> successors)
	{
		List<INode> listWithoutDuplicates = new ArrayList<INode>();
		for(INode successor : successors)
		{
			if(avoidCycle.add(successor.toString()))
			{
				listWithoutDuplicates.add(successor);
			}
		}
		return listWithoutDuplicates;
	}
}
