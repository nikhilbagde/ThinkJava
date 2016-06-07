import java.util.Scanner;

/**
 * Created by Nikhil on 5/26/2016.
 */
public class MultiplicationTables {
    public static void main(String[] args) {
        System.out.println("enter number till you want tables to be printed");
        int n = new Scanner(System.in).nextInt();
        printTables(n);
    }
    public static void printTables(int n){
        int j=0;
        while(j!=10){
            int i=0;
            while(i!=n){
                System.out.print((j+1)*(i+1) + "\t");
                //printTables(j+1);  TODO:Can be done recursively!
                i++;
            }
            System.out.println();
            j++;
        }

    }
}
