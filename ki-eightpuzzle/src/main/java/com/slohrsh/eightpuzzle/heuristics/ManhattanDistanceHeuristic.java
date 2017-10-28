package com.slohrsh.eightpuzzle.heuristics;

import com.slohrsh.interfaces.IHeuristic;

public class ManhattanDistanceHeuristic implements IHeuristic
{

	public int calculateCosts(int[] node)
	{
		int falsePosition = 0;

		for(int i = 1; i < 9; i++)
		{
			falsePosition += getCostFromActualPositionToRequiredPosition(i, node);
		}
		

		return falsePosition;
	}

	private int getCostFromActualPositionToRequiredPosition(int field, int[] node)
	{
		int[][] twoDRepresentation = convertTo2Dimensional(node);
		
		int requiredI = getRequiredI(field);
		int requiredJ = getRequiredJ(field);
		int cost = 0;
		
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				if(twoDRepresentation[i][j] == field)
				{
					cost += Math.abs(i - requiredI);
					cost += Math.abs(j - requiredJ);
					return cost;
				}
			}
		}
		
		return -1;
	}


	private int getRequiredI(int field)
	{
		if(field <= 3)
		{
			return 0;
		}
		if(field > 3 && field <= 6)
		{
			return 1;
		}
		if(field > 6 && field <= 9)
		{
			return 2;
		}
		return -1;
	}
	
	private int getRequiredJ(int field)
	{
		if(field == 1 || field == 4 || field == 7)
		{
			return 0;
		}
		if(field == 2 || field == 5 || field == 8)
		{
			return 1;
		}
		if(field == 3 || field == 6 || field == 9)
		{
			return 2;
		}
		return -1;
	}

	private int[][] convertTo2Dimensional(int[] node)
	{
		int[][] twoDRepresentation = new int[3][3];
		twoDRepresentation[0][0] = node[0];
		twoDRepresentation[0][1] = node[1];
		twoDRepresentation[0][2] = node[2];
		twoDRepresentation[1][0] = node[3];
		twoDRepresentation[1][1] = node[4];
		twoDRepresentation[1][2] = node[5];
		twoDRepresentation[2][0] = node[6];
		twoDRepresentation[2][1] = node[7];
		twoDRepresentation[2][2] = node[8];
		return twoDRepresentation;
	}
}
