package com.slohrsh.interfaces;

import java.util.List;

public interface ISearchable
{
	public List<INode> getSuccessors(INode parentNode);
}
