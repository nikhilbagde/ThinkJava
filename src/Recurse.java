import java.util.Scanner;

/**
 * Created by Nikhil on 5/25/2016.
 */
public class Recurse {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        System.out.println("Char at 1 is: " + first(s));
        System.out.println("Rest of String is: " + rest(s));
        System.out.println("Last char is: " + last(s));
        System.out.println("Length of String is: " + length(s));
        System.out.println("Printing String ");
        //printString(s);
        System.out.println("Printing String backward");
        //printBackward(s);
        System.out.println(power(2,5));

        //Log learning While loop
        System.out.println("List of log for base 10");
        printLogList(1.0);
        System.out.println("Enter Number of get Log" );
        printLog(new Scanner(System.in).nextDouble());
        System.out.println("List of log for base2");
        printLogListBase2(1.0);
        System.out.println("Enter Number of get Log for base 2" );
        printLog(new Scanner(System.in).nextDouble());
    }
    public static char first(String s){
        return s.charAt(0);
    }
    public static String rest(String s){
        return s.substring(1,s.length());
    }
    public static char last(String s){
        return s.charAt(s.length()-1);
    }
    public static int length(String s){
        return s.length();
    }
    public static void printString(String s){
        for (int i = 0; i < s.length() ; i++) {
            System.out.println(s.charAt(i));
        }
    }
    public static void printBackward(String s){
        for (int i = s.length()-1; i >= 0 ; i--) {
            System.out.println(s.charAt(i));
        }
    }
    public static String reverseString(String s){
        int i=0;
        String temp=null;
        if(i==s.length()){
            return temp;
        }else{

            reverseString(s.substring(i+1,s.length()-1));
        }
        return temp;
    }
    //Step 1: Figure out Parameter and Return value
    public static double power(double x, int n){
        //Step 2: Write a base condition
        if(n==0){
            return x;
        }
        //Step 3: Call recursion and according to condition multiply with something
        //Like in here, -> x*(recursive function)
        //power(x,n-1);
        //x = x * power(x,n-1) ;
        return x * power(x,n-1);
    }
    public static void printLogList(double n){
        while(n!=10.0){
            System.out.println(n + "  " + Math.log(n));
            //System.out.printf(n + " %f2 ", Math.log(n) );
            n = n + 1.0;
        }
    }
    public static void printLog(double n){
        System.out.println(n + " " + Math.log(n));
    }
    public static void printLogListBase2(double n){
        while(n!=10.0){
            System.out.println(n + "  " + Math.log(n)/Math.log(2.0));
            //System.out.printf(n + " %f2 ", Math.log(n) );
            n = n + 1.0;
        }
    }
    public static void printLogBase2(double n){
        System.out.println(n + " " + Math.log(n)/Math.log(2.0));
    }

}
