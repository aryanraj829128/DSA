package oodp3.inheritance;
//3

public class Boxprice extends Boxweight {
    double cost;
    Boxprice(){
        super();
        this.cost= -1;
    }
    Boxprice(Boxprice other){
        super(other);// same as Box box5=new Boxweight(2,3,4,8);
        this.cost = other.cost;

    }
    public Boxprice(double l, double h, double w, double weight, double cost){
        super(l,h,w,weight);
        this.cost=cost;
    }
    public Boxprice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}
