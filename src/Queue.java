//
// ADT: queue skeleton -- FIFO
// enqueue, dequeue, isEmpty, printQueue
//
public class Queue
{
	Node head;
	Node tail;
	
	public boolean isEmpty()
	{
			return head == null; // change as appropriate
	}
	
	public void enQueue(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		if( isEmpty() )
		{
			head = newNode;
			tail = newNode;
		}
		else
		{	tail.next = newNode;
			tail = newNode;
		}
		
	}
	
	public int deQueue()
	{	
		// change as appropriate
		if(!isEmpty())
		{
			int d = head.data;
			head = head.next;
			return d;
		}else {
			System.out.println("Queue is empty. ");
			return 0;
		}
		
	}
	
	public void printQueue()
	{	
		Node temp = head;
		System.out.print("head -> ");
		while( temp != null )
		{
			System.out.print(temp.data);
			System.out.print(" -> ");
			temp = temp.next;
		}
		System.out.println("tail");
	}
			
	
}

