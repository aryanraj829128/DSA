package STRINGS;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        Integer num= new Integer(56);
        //if you write num. then you will get lot of options because num is in object
        System.out.println(num.toString());//wrapper class this will print toString()
        System.out.println(new int[]{1,2,3,4,5});//it will call .value then .tostring() after @ its toHexString(hashCode());
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5})); // this will give {1,2,3,4,5}

        String name= null;
        System.out.println(name);
    }
}
