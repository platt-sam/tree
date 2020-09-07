///////////////////////////////////////////////////////////////////////
//
// Tree.java: class to simulate a tree
// Review Example
//
// Author: Kevin Sahr
// Created: January 1, 2010
//
///////////////////////////////////////////////////////////////////////

public class Tree
{
	// instance data
	private int age;
	private int height;
	private boolean isAlive;
	private String name;

	// Tree constructor
	public Tree (String nameIn)
	{
		age = 0;
		height = 1;
		isAlive = true;
		name = nameIn;

	} // Tree constructor

	// getter methods
	public int getAge() { return age; }
	public boolean getIsAlive() { return isAlive; }
	public int getHeight() { return height; }
	public String getName() { return name; }

	// setter methods
	public void setName (String nameIn) { name = nameIn; }
  
	// misc service methods
	public void grow (int numYears)
	{
		int years = 0;
		boolean again = isAlive;
		while (again)
		{
			growOneYear();
			again = isAlive;

			years = years + 1;
			if (years >= numYears)
				again = false;
		} // while

	} // grow method

	public String toString()
	{
		String aliveStr;
		if (isAlive) 
			aliveStr = " is alive ";
		else
			aliveStr = " is dead ";

		String s = new String("The tree " + getName() + aliveStr + 
			"at age " + getAge() + " years, with height " + 
			getHeight() + " feet.");

		return s;

	} // toString method

	// support methods
	private void growOneYear()
	{
		age = age + 1;
		height = height + (int) (Math.random() * 4) + 1;

		int diceRoll = (int) (Math.random() * 50);
		if (diceRoll == 0) isAlive = false;

	} // growOneYear method

} // class Tree


