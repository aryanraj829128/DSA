package StacksandQueue;
import java.util.Stack;
public class InbuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack();
        stack.push(45);
        stack.push(4);
        stack.push(43);
        stack.push(52);
        stack.push(32);

        System.out.println(stack.pop()); //last in first out
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());// exception empty stack exception if you pop from empty stack

    }
}
