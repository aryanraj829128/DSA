package StacksandQueue;

public class Customqueue {
    private int[] data;
    private static final int Default_size=10;

    int end=0;

    public Customqueue(){
        this(Default_size);
    }
    public Customqueue(int size){
        this.data= new int[size];
    }
    public boolean isFull(){
        return end==data.length-1;
    }
    public boolean isEmpty(){
        return end==-1;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=data[0];
        //shift the elements
        for (int i=1; i< data.length; i++){
            data[i-1]=data[i];
        }

        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }
    public void display(){
        for (int i=0; i< data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("END");

    }

}
