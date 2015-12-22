package queuePackage;

public class QueueClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayQueue a1=new ArrayQueue();
		a1.enque(10);
		//a1.size();
		a1.enque(20);
		a1.size();
		a1.enque(30);
		a1.size();
		a1.display();
		a1.deque();
		a1.display();
		a1.deque();
		a1.display();
		a1.deque();
		a1.display();
		}

	}

