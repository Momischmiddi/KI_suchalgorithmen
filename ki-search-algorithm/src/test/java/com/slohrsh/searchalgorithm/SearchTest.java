package com.slohrsh.searchalgorithm;

import com.slohrsh.interfaces.INode;

public class SearchTest
{
	protected void checkResult(INode resultNode)
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
