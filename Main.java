package STRINGS;

public class Main {
    public static void main(String[] args) {
        int[] roll={1,2,3,4,5};
        int[] ros; //declaration of ros. ros is getting defined in stack
        ros=new int[5]; //actual memory creation(heap memeory)

        String[] arr=new String[4];
        System.out.println(arr[0]);

        //comparison
        String a="Aryan";
        String b= "Aryan";
        //==
        System.out.println(a==b);//true == checks if reference variable is pointing to same object
        String c= new String("Aryan");
        String d= new String("Aryan");
        System.out.println(c==d);//false because both are new object although values are same
        //when you only need to check values use .equal() method
        System.out.println(c.equals(d));//true
        System.out.println(c.charAt(2));


    }
}
