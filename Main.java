package oodp5.extenddemo2;

public class Main implements A, B {

    @Override
    public void greet(){

    }
    public static void main(String[] agrs){
        Main obj= new Main();
        A.greeting(); // for static call via the interface name
    }
}
