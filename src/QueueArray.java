import javax.swing.*;

public class QueueArray {
    int [] q_array = {0,0,0,0,0,0,0,0,0,0};
    int maxsize = 10;
    int front = 0;
    int rear = -1;
    int nelements = 0;
    int n = 0;

    public int size (int nelements)
    {
        return nelements;
    }

    public boolean isFull(int nelements, int maxsize)
    {
        if(nelements == maxsize)
            return true;
        else {
            return false;
        }
    }

    public boolean isEmpty( int nelements)
    {
        if(nelements == 0)
            return true;
        else
        {
           return false;
        }
    }

    public int enqueue( int n , int rear, int maxsize, int[] q_array, int nelements)
    {
        if(isFull(nelements, maxsize) == true)
            return 0;
        else if (rear == maxsize -1) {
            return -1;
        }
        else {
            rear += 1;
            q_array[rear] = n;
            nelements += 1;
            return 1;
        }
    }

    public int dequeue( int a; int ; int front; int[] q_array; )
    {
        if(isEmpty(a) == true)
            return 0;
        else {

        }
    }

}
