package StacksandQueue;

public class DynamicStack extends CustomStack{

    public  DynamicStack(){
        super(); //it will call custmstack

    }
    public DynamicStack(int size){
        super(size); //it will call CutomStack (int size)
    }
    public boolean push(int item){
        //this take care if array is full
        if(this.isFull()){
            int[] temp= new int[data.length*2];
            //copy all elements
            for(int i=0; i<data.length; i++){
                temp[i] = data[i];
            }
            data= temp;
        }
        //at this point we know array is not full
        //insert item
        return super.push(item);

    }

}
