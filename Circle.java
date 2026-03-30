package oodp3.polymorphism;

public class Circle extends Shapes{
    //this will run when obj of circle is created
    //hence it is overriding the parent method
    @Override  //this is called annotation
    void area(){ //late bindiang
        System.out.println("area is pi*r*r");
    }
    //you can  not override when a method is final

    //early bindiang
//    final void area(){
//        System.out.println("area is pi*r*r");
//    }
}
