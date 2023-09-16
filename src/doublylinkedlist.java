public class doublylinkedlist {
    //INSERT
    //REMOBE
            //pRINT
    //ADD
                    //DELETE(RESTART)
    Node head;

    public boolean isEmpty() {
        return head == null;
    }
    public void print(int data) {
        System.out.print("head -> ");
        while (!isEmpty()) {
                System.out.print(head.data);
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println("NULL");

    }
    //public void insert (int day)

    public static void loop()
    {
    }
}