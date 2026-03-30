package oodp5;

public abstract class Parent {
    //no  final abstract class because we want it to be inherited
    int age;
    final int VALUE;

    public Parent(int age){
        this.age=age;
        VALUE=32356737;
    }
    //abstract Parent(); abstract constructor ar e  not allowed

    abstract void career();
    abstract void partner();
    //abstracts are need to be overridden static method can not be overridden
    //so we cannot create abstract static method
    //but we can create static method in abstract classes
    public static void hello(){
        System.out.println("Hey");

    }
    void normal() {
        System.out.println("this is a normal method");
    }
}
