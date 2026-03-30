package STRINGS;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');//op will be 195
        System.out.println("a" + "b");
        System.out.println((char)('a'+3)); //d but without (char) it will print 100

        System.out.println("a"+1);
        //integer will be converted to Integer that will call toString()

        System.out.println("Aryan" + new ArrayList<>());//initially it was empt now its converted to Aryan[]
        System.out.println("Aryan" + new Integer(56));
        //System.out.println( new Integer(56) +  new ArrayList<>()); error in java + operator is defined only when
        //you have premetives and if one of these value is String if i add ant string either its empty or not it will work
        //eg System.out.println( new Integer(56) + " " +new ArrayList<>());

        System.out.println('d'-1); //99 use char get c


    }
}
