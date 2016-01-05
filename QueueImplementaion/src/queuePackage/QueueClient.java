package queuePackage;

public class QueueClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Queue arrayQueue=new ArrayQueue();
		Queue arrayListQueue=new ArrayListQueue();
		Queue linkedListQueue=new LinkedListQueue();
		arrayQueue.enque(10);
		arrayQueue.size();
		arrayQueue.enque(20);
		arrayQueue.size();
		arrayQueue.enque(30);
		arrayQueue.size();
		arrayQueue.display();
		arrayQueue.deque();
		arrayQueue.display();
		arrayQueue.deque();
		arrayQueue.display();
		arrayQueue.deque();
		arrayQueue.display();
		arrayQueue.size();
		
		System.out.println("\n********************************\n");
		arrayListQueue.enque(10);
		arrayListQueue.size();
		arrayListQueue.enque(20);
		arrayListQueue.size();
		arrayListQueue.enque(30);
		arrayListQueue.size();
		arrayListQueue.display();
		arrayListQueue.deque();
		arrayListQueue.display();
		arrayListQueue.deque();
		arrayListQueue.display();
		arrayListQueue.deque();
		arrayListQueue.display();
		arrayListQueue.size();
	
		System.out.println("\n********************************\n");
		linkedListQueue.enque(10);
		linkedListQueue.size();
		linkedListQueue.enque(20);
		linkedListQueue.size();
		linkedListQueue.enque(30);
		linkedListQueue.size();
		linkedListQueue.display();
		linkedListQueue.deque();
		linkedListQueue.display();
		linkedListQueue.deque();
		linkedListQueue.display();
		linkedListQueue.deque();
		linkedListQueue.display();
		linkedListQueue.size();
	}

	}

