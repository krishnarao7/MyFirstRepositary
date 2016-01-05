package queuePackage;

public class ArrayQueue implements Queue{
int[] arr=new int [10];
int rear=-1,front=-1;
 public void enque(int a)
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
	System.out.println("Element Added " +a);
//	size();
	return;
}

public void display()
{
	int count;
	count=front;
	//size();
	if(front==-1 && rear==-1)
	{
		System.out.println("Array Queue Is Empty");
	}
	else{
		System.out.println("Array Queue Has:");
	while (count<=rear)
	{
		System.out.println(arr[count]);
		count++;
	}
	}
}

public void deque()
{
	
	//System.out.println(" Front "+front+"  Rear "+rear);
	if(front==-1 && rear==-1)
	{
		System.out.println("Nothing To Remove: Empty Array Queue");
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

public void size()
{
	int size;
	if(front==rear && front==-1)
		size=0;
	else
	size=(rear-front)+1;
 System.out.println("Size Of Array Queue: "+size);
	
}


}
