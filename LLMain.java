package LL;

public class LLMain {
    public static void main(String[] args) {
        LL list= new LL();
        list.insertfirst(3);
        list.insertfirst(2);
        list.insertfirst(8);
        list.insertfirst(17);
        list.insertlast(99 );
        list.insert(100, 3 );
        list.display();
        System.out.println(list.deletefirst());
        list.display();
        System.out.println(list.deletelast());
        list.display();
        list.delete(2);
        list.display();
        //list.reverse();;

    }
}
