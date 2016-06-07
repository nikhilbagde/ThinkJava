/**
 * Created by Nikhil on 5/25/2016.
 */

import java.util.Scanner;

/**
 * 99 bottles of beer on the wall, 99 bottles of beer, ya' take one
 down, ya' pass it around,
 */
public class Recursive {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int numberofTime = scanner.nextInt();*/

        printSong(new Scanner(System.in).nextInt());

    }
    public static void printSong(int numberOfTimes){
        if(numberOfTimes == 0){
            System.out.println("No bottles of beer on the wall, no bottles of beer, ya' can't take\n" +
                    "one down, ya' can't pass it around, 'cause there are no more\n" +
                    "bottles of beer on the wall!");
        }else{
            System.out.println( numberOfTimes + " bottles of beer on the wall, "+ numberOfTimes +" bottles of beer, ya' take one\n" +
                    " down, ya' pass it around,");
            printSong(numberOfTimes-1);
        }
    }
}
