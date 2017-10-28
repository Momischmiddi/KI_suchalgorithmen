package com.slohrsh.eightpuzzle.heuristics;

import java.util.Arrays;

import com.slohrsh.interfaces.IHeuristic;

public class FalsePositionHeuristic implements IHeuristic
{

	public int calculateCosts(int[] node)
	{
		int falsePosition = 0;
		falsePosition += node[0] != 1 ? 1 : 0;
		falsePosition += node[1] != 2 ? 1 : 0;
		falsePosition += node[2] != 3 ? 1 : 0;
		falsePosition += node[3] != 4 ? 1 : 0;
		falsePosition += node[4] != 5 ? 1 : 0;
		falsePosition += node[5] != 6 ? 1 : 0;
		falsePosition += node[6] != 7 ? 1 : 0;
		falsePosition += node[7] != 8 ? 1 : 0;
		return falsePosition;
	}

}
