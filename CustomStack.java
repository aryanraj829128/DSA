package StacksandQueue;

public class CustomStack {

    int ptr=-1;
    protected int[] data;
    private static final int Default_Size= 10;

    public CustomStack(){
        this(Default_Size);
    }

    public CustomStack(int size){
        this.data= new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full!!");
            return false;
        }

        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from empty stack!!");
        }
        int removed= data[ptr];
        ptr--;
        return removed;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peekp from empty stack!!");
        }
        int peek= data[ptr];
        return data[peek];

    }
    public boolean isFull(){
        return ptr== data.length-1;
    }
    public boolean isEmpty() {
        return ptr == -1;
    }
}
