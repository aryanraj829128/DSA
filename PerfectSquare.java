package Recursion;

public class PerfectSquare {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(numSquares(n));

    }
    private static int minSquare(int n){
        if(n==0) return 0;
        int minCount = Integer.MAX_VALUE;
        for (int i=1; i*i<=n;i++){
            minCount = Math.min(minCount,  1+ minSquare(n-i*i));
        }
        return minCount;

    }
    public static int numSquares(int n){
        return minSquare(n);
    }
}
