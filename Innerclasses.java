package oodp2.Staitc;

//outside classes can not be static because it is not itself is dependent on any other class
public class Innerclasses {
    static class Test{ //but it depends on outside class so it can be static
        String name;
        public Test(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Test a= new Test("Kunal");
        Test b= new Test("Rahul");
//this two sout will give Rahul as an output because class test is not static
        System.out.println(a.name);
        System.out.println(b.name);

//this two sout will give Kunal Rahul as an output because class test is not static
        System.out.println(a.name);
        System.out.println(b.name);

    }
}
//class test is mentioned as static and it is not dependent on the object of innerclass
//but main and test can have instances of each other
//static  deooes mean that object cant have its own identity it basically means that does not depend on the object of this

