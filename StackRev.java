import java.util.*;
public class StackRev {
    //  NOT FOR REVERSE TO ADD ELEMENT AT BOTTOM...
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
       
        addAtBottom(stack,5);
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }

    private static void addAtBottom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int tem = s.pop();
        addAtBottom(s, data);
        s.push(tem);
    }
    
}
