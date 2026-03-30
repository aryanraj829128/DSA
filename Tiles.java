package Recursion;

public class Tiles {
    public static void main(String[] args) {
        /*You are given an integer n, representing the length of a floor (or board).

You have two types of tiles available:
Tile of length 1
Tile of length 4
You can place tiles in any order, but they must exactly cover the floor of length n (no gaps, no overflow).
Your task is to return the number of different ways to tile a floor of length n using these tiles.*/
        int n=5;
        System.out.println(countWays(n));
    }
    public static int countWays(int n){
        if(n<4){
            return 1;
        }
        return countWays(n-1) + countWays(n-4);
    }
}
