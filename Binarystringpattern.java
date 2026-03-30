package Recursion;

public class Binarystringpattern {
    public static void main(String[] args) {
        int n=3;
        System.out.println("Number of binary string with length" + n +"without consective ones "+coutnBinarystring(n));
    }
    public static int coutnBinarystring(int n){
        if(n == 1) return 2;
        if(n == 2) return 3;
        return coutnBinarystring(n-1) + coutnBinarystring(n-2);
    }
}
