
import java.util.Stack;

public class JavaStackDemo {
    public static void main(String[] args) {
        Stack<String> namesStack = new Stack<String>(); // anything in the operators has to be an object
        namesStack.push("Anne");
        namesStack.push("Joel");
        namesStack.push("Jane");
        namesStack.push("Ian");
        System.out.println(namesStack);
        System.out.println(namesStack.peek());
        System.out.println(namesStack.remove(3));
        System.out.println(namesStack);



    }
}
