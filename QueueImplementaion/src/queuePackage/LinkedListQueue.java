package queuePackage;


import java.util.LinkedList;

public class LinkedListQueue implements Queue {
	LinkedList<Integer> LinkListQueue=new LinkedList<Integer>();
	
	public void enque(int a)
	{
		LinkListQueue.addLast(a);
		return;
	}

	public void deque()
	{
		if(LinkListQueue.isEmpty())
		{
			System.out.println("Nothing To Remove: Linked List Queue Is Empty ");
		}
		else
			System.out.println("Element Removed: "+LinkListQueue.remove(0));
	}

	public void display()
	{
		if(LinkListQueue.isEmpty())
		{
			System.out.println("Linked List Queue Is Empty ");
		}
		else
		{
		System.out.println("Linked List Queue Has:");
		for(Integer obj:LinkListQueue)
		{
			System.out.println(obj);
		}
		}
	}

	
	public void size(){
		System.out.println("Size Of Linked List Queue: "+LinkListQueue.size());
	}
}
