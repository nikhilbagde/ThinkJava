/**
 * Created by Nikhil on 5/27/2016.
 */
public class StringOperation2 {
    public static void main(String[] args) {
        String test = "Nikhil";
        char test1 = 'B';
        String test2 = test + test1;
        System.out.println(test2);
        System.out.println(test2.getClass());

        test =  "";
        test = test + test1;
        System.out.println(test);
        /**
         ----------------------------------------------------------------------------
         |           |boolean       |char           |int            |String         |
         ----------------------------------------------------------------------------
         |boolean    |Error         |Error          |Error          |Concatenation  |
         |char       |Error         |Addition       |Addition       |Concatenation  |
         |int        |Error         |Addition       |Addition       |Concatenation  |
         |String     |Concatenation |Concatenation  |Concatenation  |Concatenation  |
         ----------------------------------------------------------------------------
         */
        boolean b1 = true;
        boolean b2 = false;

        char c1 = 'a';
        char c2 = 'b';

        int i1 = 1;
        int i2 = 2;

        String s1 = "First";
        String s2 = "Second";

        //System.out.println(b1 + b2);
        //System.out.println(b1 + c1);
        //System.out.println(b1 + i1);
        System.out.println(b1 + s1); // trueFirst
        System.out.println(c1 + c2); // 97 + 98 = 195
        System.out.println(c1 + i1); // 97 + 1 = 98
        System.out.println(c1 + s1); // aFirst
        System.out.println(i1 + i2); // 3
        System.out.println(i1 + s1); // 1First
        System.out.println(s1 + s2); // FirstSecond

        //Case1 : c1++ ->Works
        System.out.println(++c1);
        //Case2: c1 = c1 + 1 -> Doesn't work
        //c1 = c1 + 1; //Incompatible types char and int compilation error.
    }
}
