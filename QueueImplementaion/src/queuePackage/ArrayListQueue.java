package queuePackage;

import java.util.ArrayList;

public class ArrayListQueue {
ArrayList<Integer> ArrListQueue=new ArrayList<Integer>();

void enque(int a)
{
	ArrListQueue.add(a);
}

void deque()
{
	ArrListQueue.remove(0);
}

void display()
{
	if(ArrListQueue.isEmpty())
	{
		System.out.println("Empty Queue");
	}
	else
	{
	System.out.println("Queue Has:");
	for(Integer obj:ArrListQueue)
	{
		System.out.println(obj);
	}
	}
}

void size(){
	System.out.println(ArrListQueue.size());
}
}
