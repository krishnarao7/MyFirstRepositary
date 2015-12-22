package queuePackage;

public class ArrayQueue {
int[] arr=new int [10];
int rear=-1,front=-1;
void enque(int a)
{
	if(front==-1 && rear==-1) 
	{
		arr[rear+1]=a;
		rear=front=0;
	}
	else
	{
		arr[rear+1]=a;
		rear++;
	}
}

void display()
{
	
	if(front==-1 && rear==-1)
	{
		System.out.println("Empty Queue");
	}
	else{
		System.out.println("Queue Has:");
	while (front<=rear)
	{
		System.out.println(" Entered "+arr[front]);
		front++;
	}
	}
}

void deque()
{
	System.out.println(" Front "+front+"  Rear "+rear);
	if(front==-1 && rear==-1)
	{
		System.out.println("Nothing To Remove: Empty Queue");
	}
	else{
		if(front==rear)
		{
			System.out.println("Element Removed: "+arr[front]);
			front=rear=-1;
		}
		else
		{
			System.out.println("Element Removed: "+arr[front]);
			front++;
		}
		
				
	}
	
	
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
ArrayQueue a1=new ArrayQueue();
a1.enque(10);
//a1.display();
a1.enque(20);
a1.enque(30);
a1.display();
a1.deque();
a1.display();
a1.deque();
a1.display();
}

}
