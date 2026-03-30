package STRINGS;

public class Performance {
    public static void main(String[] args) {
        //string does not allow you to change value it will create new object

        String series= "";
        for (int i=0; i< 26; i++){
            char ch= (char)('a'+i);
            //System.out.print(ch);
            series= series+ch;
        }
        System.out.println(series);
    }
}
