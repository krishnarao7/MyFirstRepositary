package buildCard3;

import java.util.ArrayList;

public class Car {
	static ArrayList <SubSystem> SubSys= new ArrayList<SubSystem>() ;
	String name;
	static int cost;
	
	
	public Car(String name) {
		
		this.name = name;
	}
	
	void addSSys(SubSystem s)
	{
		SubSys.add(s);
	}

	static int getcost()
	{
		int cost = 0;
		for (SubSystem X : SubSys)
		cost+=X.SSprice;
		return cost;
	}

	}
