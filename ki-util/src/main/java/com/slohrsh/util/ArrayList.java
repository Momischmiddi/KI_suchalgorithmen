package com.slohrsh.util;


public class ArrayList<E> extends java.util.ArrayList<E>
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void add(int index, E element)
	{
		if(element != null)
		{
			super.add(index, element);
		}
		return;
	}

	@Override
	public boolean add(E element)
	{
		if(element != null)
		{
			super.add(element);
		}
		return false;
	}
	
}
