package queuePackage;

public class QueueClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Queue arrayQueue=new ArrayQueue();
		Queue arrayListQueue=new ArrayListQueue();
		Queue linkedListQueue=new LinkedListQueue();
		
		int dqEle=-1;
	
		
		System.out.println("Enqueue 10");
		if(arrayQueue.enque(10)==false) System.out.println("Enqueue Error");
		System.out.println("Enqueue 20");
		if(arrayQueue.enque(20)==false) System.out.println("Enqueue Error");
		System.out.println("Enqueue 30");
		if(arrayQueue.enque(30)==false) System.out.println("Enqueue Error");
		System.out.println("Elements In Queue: ");
		if(arrayQueue.display()==false) System.out.println("Empty Queue");
		//else linkedListQueue.display();
		System.out.println("Size Of Queue :"+arrayQueue.size());
		System.out.print("Element Dequeued: ");
		dqEle=arrayQueue.deque();
		if(dqEle!=-1)System.out.println(dqEle);
		else System.out.println("Empty Queue");
		System.out.print("Element Dequeued: ");
		dqEle=arrayQueue.deque();
		if(dqEle!=-1)System.out.println(dqEle);
		else System.out.println("Empty Queue");
		System.out.print("Elements In Queue: ");
		if(arrayQueue.display()==false) System.out.println("Empty Queue");
		//else arrayQueue.display();
		System.out.print("Element Dequeued: ");
		dqEle=arrayQueue.deque();
		if(dqEle!=-1)System.out.println(dqEle);
		else System.out.println("Empty Queue");
		System.out.print("Elements In Queue:  ");
		if(arrayQueue.display()==false) System.out.println("Empty Queue");
		//else linkedListQueue.display();
		System.out.println("Size Of Queue :"+arrayQueue.size());
		
		
		
		System.out.println("\n********************************\n");
		
		
		System.out.println("Enqueue 10");
		if(arrayListQueue.enque(10)==false) System.out.println("Enqueue Error");
		System.out.println("Enqueue 20");
		if(arrayListQueue.enque(20)==false) System.out.println("Enqueue Error");
		System.out.println("Enqueue 30");
		if(arrayListQueue.enque(30)==false) System.out.println("Enqueue Error");
		System.out.println("Elements In Queue: ");
		if(arrayListQueue.display()==false) System.out.println("Empty Queue");
		//else linkedListQueue.display();
		System.out.println("Size Of Queue :"+arrayListQueue.size());
		System.out.print("Element Dequeued: ");
		dqEle=arrayListQueue.deque();
		if(dqEle!=-1)System.out.println(dqEle);
		else System.out.println("Empty Queue");
		System.out.print("Element Dequeued: ");
		dqEle=arrayListQueue.deque();
		if(dqEle!=-1)System.out.println(dqEle);
		else System.out.println("Empty Queue");
		System.out.print("Elements In Queue: ");
		if(arrayListQueue.display()==false) System.out.println("Empty Queue");
		//else linkedListQueue.display();
		System.out.print("Element Dequeued: ");
		dqEle=arrayListQueue.deque();
		if(dqEle!=-1)System.out.println(dqEle);
		else System.out.println("Empty Queue");
		System.out.print("Elements In Queue:  ");
		if(arrayListQueue.display()==false) System.out.println("Empty Queue");
		//else linkedListQueue.display();
		System.out.println("Size Of Queue :"+arrayListQueue.size());
	
		
		
		System.out.println("\n********************************\n");
		
		
		
		System.out.println("Enqueue 10");
		if(linkedListQueue.enque(10)==false) System.out.println("Enqueue Error");
		System.out.println("Enqueue 20");
		if(linkedListQueue.enque(20)==false) System.out.println("Enqueue Error");
		System.out.println("Enqueue 30");
		if(linkedListQueue.enque(30)==false) System.out.println("Enqueue Error");
		System.out.println("Elements In Queue: ");
		if(linkedListQueue.display()==false) System.out.println("Empty Queue");
		//else linkedListQueue.display();
		System.out.println("Size Of Queue :"+linkedListQueue.size());
		System.out.print("Element Dequeued: ");
		dqEle=linkedListQueue.deque();
		if(dqEle!=-1)System.out.println(dqEle);
		else System.out.println("Empty Queue");
		System.out.print("Element Dequeued: ");
		dqEle=linkedListQueue.deque();
		if(dqEle!=-1)System.out.println(dqEle);
		else System.out.println("Empty Queue");
		System.out.print("Elements In Queue: ");
		if(linkedListQueue.display()==false) System.out.println("Empty Queue");
		//else linkedListQueue.display();
		System.out.print("Element Dequeued: ");
		dqEle=linkedListQueue.deque();
		if(dqEle!=-1)System.out.println(dqEle);
		else System.out.println("Empty Queue");
		System.out.print("Elements In Queue:  ");
		if(linkedListQueue.display()==false) System.out.println("Empty Queue");
		//else linkedListQueue.display();
		System.out.println("Size Of Queue :"+linkedListQueue.size());
	}

	}

