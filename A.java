package oodp5.extenddemo2;

public interface A {
    default void fun(){
        System.out.println("I am in A");
    }
    // static interface methods should always have a body. (wrong)static void greeting();(wrong)static void greeting(){}
    // call via the interface name
    static void greeting(){
        System.out.println("Hey i am static medhod");
    }
}
