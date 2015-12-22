package queuePackage;

import java.util.ArrayList;

public class ArrayListQueue {
ArrayList<Integer> ArrListQueue=new ArrayList<Integer>();

void enque(int a)
{
	ArrListQueue.add(a);
	System.out.println("Element Added " +a);
}

void deque()
{
	if(ArrListQueue.isEmpty())
	{
		System.out.println("Nothing To Remove: ArrayList Queue Is Empty");
	}
	else
		System.out.println("Element Removed: "+ArrListQueue.remove(0));
}

void display()
{
	if(ArrListQueue.isEmpty())
	{
		System.out.println("ArrayList Queue Is Empty");
	}
	else
	{
	System.out.println("ArrayList Queue Has:");
	for(Integer obj:ArrListQueue)
	{
		System.out.println(obj);
	}
	}
}

void size(){
	System.out.println("Size Of ArrayList Queue: "+ ArrListQueue.size());
}
}
