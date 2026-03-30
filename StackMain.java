package StacksandQueue;

public class StackMain {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);
        stack.push(45);
        stack.push(4);
        stack.push(43);
        stack.push(52);
        stack.push(32);
        stack.push(11);//this will give me stack is full op only if you use CustomStack stack = new CustomStack(5);
        //but if i use DynamicStack stack = new DynamicStack(5); then it will double the size
        //CustomStack stack = new DynamicStack(5);//if this is the case you will still get new element printed

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
