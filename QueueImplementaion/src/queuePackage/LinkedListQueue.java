package queuePackage;


import java.util.LinkedList;

public class LinkedListQueue implements Queue {
	LinkedList<Integer> LinkListQueue=new LinkedList<Integer>();
	
	public boolean enque(int a)
	{
		LinkListQueue.addLast(a);
		return true;
	}

	public int deque()
	{
		if(LinkListQueue.isEmpty())
		{
			return -1;
		}
		else
			return LinkListQueue.remove(0);
	}

	public boolean display()
	{
		if(LinkListQueue.isEmpty())
		{
			return false;
		}
		else
		{
		//System.out.println("Linked List Queue Has:");
		for(Integer obj:LinkListQueue)
		{
			System.out.println(obj);
		}
		return true;
		}
		
	}

	
	public int size(){
		return LinkListQueue.size();
	}
}
