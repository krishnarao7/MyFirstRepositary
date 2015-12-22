package queuePackage;

public class ArrayQueue {
int[] arr=new int [10];
int rear=-1,front=-1;
void enque(int a)
{
	//System.out.println(" Front "+front+"  Rear "+rear);
	//size();
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
//	System.out.println("On Adding " +a+"size is ");
//	size();
}

void display()
{
	int count;
	count=front;
	//size();
	if(front==-1 && rear==-1)
	{
		System.out.println("Empty Queue");
	}
	else{
		System.out.println("Queue Has:");
	while (count<=rear)
	{
		System.out.println(arr[count]);
		count++;
	}
	}
}

void deque()
{
	
	//System.out.println(" Front "+front+"  Rear "+rear);
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

void size()
{
	int size;
	if(front==rear && front==0)
		size=1;
	else
	size=(rear-front)+1;
 System.out.println("Size Of Queue: "+size);
	
}


}
