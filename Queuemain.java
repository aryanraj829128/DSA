package StacksandQueue;

public class Queuemain {
    public static void main(String[] args) throws Exception {
        //Customqueue queue= new Customqueue(5);
//        queue.insert(3);
//        queue.insert(6);
//        queue.insert(5);
//        queue.insert(19);
//        queue.insert(1);
//
//        queue.display();
//        System.out.println(queue.remove());
//        queue.display();

        Circularqueue queue= new Circularqueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);

        queue.display();
        System.out.println(queue.remove());
        queue.display();

    }
}
