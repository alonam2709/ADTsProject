//
// ADT: queue skeleton -- FIFO
// enqueue, dequeue, isEmpty, printQueue

public class Queue
{
	Node head;
	Node tail;
	int c = 0;
	
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
		c++;
		
	}
	
	public int deQueue()
	{	
		// change as appropriate
		if(!isEmpty())
		{
			int d = head.data;
			head = head.next;
			c--;
			return d;
		}else {
			System.out.println("Queue is empty. ");
			return 0;
		}
		
	}
	
	public void printQueue() {
		Node e = head;
		System.out.print("head -> ");
		while (e != null) {
			if (e.next == null) System.out.print("tail -> ");
			System.out.print(e.data);
			System.out.print(" -> ");
			e = e.next;
		}
		System.out.println("NULL");
		System.out.println("The Size in m is " + c);

	}
	// Another option
	/*
	public int size()
	{
		Node temp = head;
		int counter = 0;
		while(temp != null)
		{
			counter++;
			temp = temp.next;
		}
		return counter;
	}
	*/
}

