/**
 * Created by Nikhil on 5/27/2016.
 */
public class DigitSwap {
    public static void main(String[] args) {
        int number = 17;
        int lastDigit = number%10;
        int firstDigit = number/10;
        //System.out.println(lastDigit + firstDigit); //output 8
        System.out.println(lastDigit +""+ firstDigit); //output 71

        int number2 = 1234;                     //Generalization:
        firstDigit = number2/1000;              //1234/1000= 1.~ ->1.~%10 = 1
        int secondDigit = (number2/100)%10;     //1234/100= 12.~ ->12.~%10 = 2
        int thirdDigit = (number2/10)%10;       //1234/10= 123.~ ->123.~%10 = 3
        int forthDigit = number2%10;            //1234%10= 4
        //System.out.println(forthDigit +" "+thirdDigit+" "+secondDigit+" "+firstDigit);
        System.out.println(forthDigit +""+thirdDigit+""+secondDigit+""+firstDigit);
    }
}
