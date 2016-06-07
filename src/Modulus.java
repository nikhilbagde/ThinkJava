import java.util.Scanner;

/**
 * Created by Nikhil on 5/25/2016.
 */
public class Modulus {
    public static void main(String[] args) {
        System.out.println("Enter Any Integer Number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Which place number you want to extract ?");
        System.out.println("E.g. 235, 5th is first, 3 is second and 2 is third");

        int position = scanner.nextInt();
        System.out.print("Number at " + position + " is:");
        System.out.println(findNumberAtPosition(number, position));


    }
    public static int calculatePlacePower(int position){
        //int divider = (int) Math.pow(10, position);
        return (int) Math.pow(10, position);
    }

    public static int findNumberAtPosition(int number, int position){
        return number % calculatePlacePower(position);
    }

    public static double absoluteValue(double x){
        if(x<0){
            return -x;
        }else if(x>0){
            return  x;
        }/*else{
            return;
        }*/
        return 0.0;
    }

}
