import java.beans.BeanInfo;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Nikhil on 5/28/2016.
 */
public class FactorialIterative {
    public static void main(String[] args) {
        findFactorial(new Scanner(System.in).nextInt());
    }
    public static void findFactorial(int number){
        for (int i = 1; i <=number ; i++) {
            show("Factorial of\t" + i + "\t" + factorial(i));
        }
    }
    public static BigInteger factorial(int number){
        int factorial = 1;
        BigInteger factorialBig = BigInteger.valueOf(factorial);
        for (int i = number; i >= 1; i--) {
            factorialBig = factorialBig.multiply(BigInteger.valueOf(i));
        }
        return factorialBig;
    }
    public static void show(String s){
        System.out.println(s);
    }
    public static void show(boolean s){
        System.out.println(s);
    }
    public static void show(int s){
        System.out.println(s);
    }
    public static void show(char s){
        System.out.println(s);
    }
    public static void show(double s){
        System.out.println(s);
    }
    public static void show(){
        System.out.println();
    }
}
