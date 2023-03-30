import java.util.Stack;

import java.util.Stack;
public class DenarytoBinary {
    public static void main(String[] args) {
        Stack<Integer> remainderStack = new Stack<Integer>(); // anything in the operators has to be an object
        int s = IBIO.inputInt("Enter a number that is a denary ");
        while(s != 0)
        {
            int remainder = s % 2;
            remainderStack.push(remainder);
            s = s / 2;
        }
        while(!remainderStack.isEmpty())
        {
            System.out.print(remainderStack.pop());
        }
    }
}
