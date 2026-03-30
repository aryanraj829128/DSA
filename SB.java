package STRINGS;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder= new StringBuilder();
        for (int i=0; i<26; i++){
            char ch= (char) ('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString()); //it will work without toString also because it automatically calls toString
        //this mutable
        System.out.println(builder.deleteCharAt(0));
        System.out.println(builder.reverse()); //you can reverse it

    }
}
