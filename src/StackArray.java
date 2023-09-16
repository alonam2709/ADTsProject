public class StackArray {
    int[] s_array = {0,0,0,0,0,0,0,0,0,0} ;
    int maxsize = 10;
    int high = -1;
    int n = 0;
    public boolean isFull(int high, int maxsize)
    {
        if( high == maxsize-1)
            return true;
        else {
            return false;
        }
    }

    public boolean isEmpty( int [] a, int high)
    {
        if(high == -1)
            return true;
        else {
            return false;
        }
    }

    public int size(int high)
    {
        return high + 1;
    }

    public void push(int n , int maxsize, int high, int[] s_array)
    {
        if(isFull(high,maxsize) == true)
            System.out.println("Stack is empty");
        else {
            high += 1;
            s_array[high] = n;
        }
    }

    public int pop(int maxsize, int high, int[] s_array)
    {
        if(isEmpty(s_array, high) == true)
            return 0;
        else {
            high = high - 1;
            return s_array[high+1];
        }
    }


}
