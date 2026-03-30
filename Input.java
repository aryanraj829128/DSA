package STRINGS;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=23;
        arr[1]=45;
        arr[2]=23;
        arr[3]=543;
        arr[4]=3;
        System.out.println(arr[3]);

        //input using loops
        Scanner in= new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i]= in.nextInt();
        }
        //output using loops
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }
        //doing same using enhanced for loop
        for(int nums: arr){
            System.out.print(nums+ " "); //here nums represent elements of array
        }

    }
}
