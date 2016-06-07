/**
 * Created by Nikhil on 5/27/2016.
 */
public class Mystery {
    public static String mystery(String s) {
        System.out.println(s.length());
        int i = s.length() - 1;
        String total = "";
        while (i >= 0 ) {
            char ch = s.charAt(i);
            System.out.println(i + " " + ch);
            total = total + ch;
            i--;
        }
        System.out.println(total.length());
        return total;
    }
    public static void main(String[] args) {
        System.out.println(mystery("Allen"));
    }
}
