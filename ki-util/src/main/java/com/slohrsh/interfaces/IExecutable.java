package com.slohrsh.interfaces;

import java.util.List;

public interface IExecutable
{
	public INode startSearch(List<INode> parentNode, INode goal);
}
