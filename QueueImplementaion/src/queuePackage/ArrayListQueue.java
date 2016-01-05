package queuePackage;

import java.util.ArrayList;

public class ArrayListQueue implements Queue {
ArrayList<Integer> ArrListQueue=new ArrayList<Integer>();

public boolean enque(int a)
{
	ArrListQueue.add(a);
	//System.out.println("Element Added " +a);
	return true;
}

public int deque()
{
	if(ArrListQueue.isEmpty())
	{
		return -1;
	}
	else
		return ArrListQueue.remove(0);
}

public boolean display()
{
	if(ArrListQueue.isEmpty())
	{
		return false;
	}
	else
	{
	//System.out.println("ArrayList Queue Has:");
	for(Integer obj:ArrListQueue)
	{
		System.out.println(obj);
	}
	return true;
	}
}

public int size(){
		return  ArrListQueue.size();
}
}
