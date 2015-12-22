package queuePackage;


import java.util.LinkedList;

public class LinkedListQueue {
	LinkedList<Integer> LinkListQueue=new LinkedList<Integer>();
	
	void enque(int a)
	{
		LinkListQueue.addLast(a);
		System.out.println("Element Added " +a);
	}

	void deque()
	{
		if(LinkListQueue.isEmpty())
		{
			System.out.println("Nothing To Remove: Linked List Queue Is Empty ");
		}
		else
			System.out.println("Element Removed: "+LinkListQueue.remove(0));
	}

	void display()
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

	
	void size(){
		System.out.println("Size Of Linked List Queue: "+LinkListQueue.size());
	}
}
