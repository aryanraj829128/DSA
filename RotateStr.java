package STRINGS;

public class RotateStr {
    public static void main(String[] args) {
        String a = "abcde";
        String goal = "abced";
        boolean ans = rotateString(a, goal);
        System.out.println(ans);
    }

    public static boolean rotateString(String a, String goal){
        if(a.length() != goal.length()) return false;
        String temp = a + a;
        return temp.contains(goal);
    }
}
