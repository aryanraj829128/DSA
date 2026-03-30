package oodp3.inheritance;
//2

public class Boxweight extends Box {
    double weight;

    public Boxweight(){
        this.weight= -1;
    }
    public Boxweight(double side, double weight){
        super(side);
        this.weight= weight;
    }
    public Boxweight(double l, double h, double w, double weight){
        //if we dont write super then default one will be called, 0 arguments wala
        super(l,h,w); //call the parent class constructor
        //use to initialise values present in parent class

        //System.out.println(super.l); we can do this also
        this.weight= weight;
    }
    public Boxweight(Boxweight other){
        //same thing as Box box5=new Boxweight(2,3,4,8);
        super(other);

    }

}
