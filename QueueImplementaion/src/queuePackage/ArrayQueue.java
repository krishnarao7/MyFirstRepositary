package queuePackage;

public class ArrayQueue implements Queue{
int[] arr=new int [10];
int rear=-1,front=-1;
 public boolean enque(int a)
{
if(size()<10){
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
	return true;
}else 
	return false;

}

public boolean display()
{
	int count;
	count=front;
	//size();
	if(front==-1 && rear==-1)
	{
		return false;
	}
	else{
		
	while (count<=rear)
	{
		System.out.println(arr[count]);
		count++;
	}
	return true;
	}
}

public int deque()
{
	int dq;
	//System.out.println(" Front "+front+"  Rear "+rear);
	if(front==-1 && rear==-1)
	{
		return -1;
	}
	else{
		if(front==rear)
		{
			//System.out.println("Element Removed: "+arr[front]);
			dq=arr[front];
			front=rear=-1;
			return dq;
		}
		else
		{
			dq=arr[front];
			front++;
			return dq;
		}
		
				
	}
	
	
}

public int size()
{
	int size;
	if(front==rear && front==-1)
		return size=0;
	else
	size=(rear-front)+1;
return size;
	
}


}
