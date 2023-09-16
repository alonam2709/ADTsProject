// This is the definition of a node for an ADT
// Singly-linked
public class Node
{
	Node next; // self-reference (Node has another node inside of it)
	int data;
// empty constructuor
	public Node()
	{

	}
	public Node(int d)
	{
		this.data = d;
	}
	public boolean hasNext()
	{
		return this.next != null;
	}

}

