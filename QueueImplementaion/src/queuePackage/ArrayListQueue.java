package queuePackage;

import java.util.ArrayList;

public class ArrayListQueue implements Queue {
ArrayList<Integer> ArrListQueue=new ArrayList<Integer>();

public void enque(int a)
{
	ArrListQueue.add(a);
	System.out.println("Element Added " +a);
	return;
}

public void deque()
{
	if(ArrListQueue.isEmpty())
	{
		System.out.println("Nothing To Remove: ArrayList Queue Is Empty");
	}
	else
		System.out.println("Element Removed: "+ArrListQueue.remove(0));
}

public void display()
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

public void size(){
	/*if (ArrListQueue.isEmpty())
		System.out.println("Size Of ArrayList Queue is 0");
	else*/
	System.out.println("Size Of ArrayList Queue: "+ ArrListQueue.size());
}
}
