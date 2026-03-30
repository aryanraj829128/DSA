package LL;

public class DLLMain {
    public static void main(String[] args) {
        DLL list= new DLL();
        list.insertfirst(11);
        list.insertfirst(12);
        list.insertfirst(13);
        list.insertfirst(14);
        list.insertfirst(15);
        list.display();
        System.out.println();
        list.insert(12,65);
        list.display();


    }
}
