package Recursion;

public class Ropescut {
    public static void main(String[] args) {
        int n=13;
        int a=5;
        int b=3;
        int c=2;
        int ans= maxcuts(n, a,b,c);
        System.out.println(ans);

    }

    public static int maxcuts(int n, int a, int b, int c){
        if(n==0) return 0;
        if(n<0) return -1;

        int resA=maxcuts(n-a,a,b,c);
        int resB=maxcuts(n-b,a,b,c);
        int resC=maxcuts(n-c,a,b,c);

        int result= Math.max(resA, Math.max(resB, resC));
        if(result ==-1) return -1;
        return result+1;
    }
}
