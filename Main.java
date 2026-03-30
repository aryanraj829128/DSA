package oodp3.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape= new Shapes();
        Circle circle= new Circle();
        Square square= new Square();
        Shapes square1= new Square();


        shape.area();
        circle.area();
        square.area();
        square1.area(); //op as area is square of side lakin humne pahale pdha tha ke left wala decide krega
        //ke kya accees hoga lakin esme right wala print kr raha hai kyu
        //because object is of circle it will call circle one and which method will be called will depend on child
        //this is known as upcasting
    }
}
