package LL;

public class Circularmain {
    public static void main(String[] args) {
        CircularLL list= new CircularLL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.display();
        list.delete(3);
        list.display();
    }
}
