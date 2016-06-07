import java.util.Scanner;

/**
 * Created by Nikhil on 5/26/2016.
 */
public class StringOperation {
    public static void main(String[] args) {
        //String testString = new Scanner(System.in).next();
        char findChar = 'i'; // = new Scanner(System.in).next();
        //show("Char 'i' is at position " + letterCounter(new Scanner(System.in).next(),findChar));
        //show("Index of 'i' Starting from 2 is: " + findIndexOfLetter(new Scanner(System.in).next(),findChar));
        //printBackward(new Scanner(System.in).next());
        //show(getBackwardString(new Scanner(System.in).nextLine()));
        //show(validateExpression(new Scanner(System.in).nextLine()));
        //show(isAbecedarianRecursive(new Scanner(System.in).nextLine()));
        //show(isAbecedarianIterative(new Scanner(System.in).nextLine()));
        //show(isDupledromeRecursive("llabmmaa")); //not working
        //show(isDupledromeRecursive("ssaabb")); //not working
        //show(isDupledromeIterative("llaammaa")); //working
        //show(isDupledromeIterative("ssaabb")); //working
        show(captainCrunchDecoder("z",1));
    }
    public static int letterCounter(String testString, char findChar){
        int index = 0, counter =0;
        while(index < testString.length()){
            if(testString.charAt(index) == findChar ){
                counter++;
            }
            index++;
        }
        return counter;
    }
    public static int findIndexOfLetter(String testString, char findChar){
        return testString.indexOf(findChar,2);
    }
    public static void printBackward(String testString){
        int index = testString.length()-1;
        while(index >= 0) {
            System.out.print(testString.charAt(index));
            index--;
        }
        show();
    }
    public static char[] getBackwardString(String testString){
        int index = testString.length()-1;
        char [] reverseString = new char[testString.length()];
        while(index >= 0) {
            reverseString[testString.length()- (index +1)] = testString.charAt(index);
            index--;
        }
        return reverseString;
    }
    public static boolean validateExpression(String testString){
        int count = 0;
        int index = 0;
        while ( index < testString.length()){
            if(testString.charAt(index)== '('){
                count ++;
            }else if(testString.charAt(index)==')'){
                count--;
            }
            index++;
        }
        return count == 0;
    }
    public static boolean isAbecedarianRecursive(String s){
        if(s.length()==1){
            return true;
        }else if (first(s)<second(s)){
            isAbecedarianRecursive(rest(s));
        }else{
            //return false;
            System.exit(1);            
        }
        return true;
    }
    public static char first(String s){
        return s.charAt(0);
    }
    public static char second(String s){
        return s.charAt(1);
    }
    public static String rest(String s){
        return s.substring(1,s.length());
    }
    public static boolean isAbecedarianIterative(String s){
        int index = 0;
        while(index<s.length()-1){
            //System.out.print(charcAt(s,index));
            //show(charcAt(s,index+1));
            if(!(charcAt(s,index) < charcAt(s,index+1))){
                return false;
            }
            index++;
        }
        return true;
    }
    public static char charcAt(String s, int index){ //llaammaa ssaabb
        return s.charAt(index);
    }

    //TODO://This is wrong!!!!
    public static boolean isDupledromeRecursive(String s){
        if(s.length()==1){
            if(!firstHalf(s).equals(secondHalf(s))){
                return false;
            }
        }
        if(s.length()%2 == 0 && s.length()%3 != 0){
            show(firstHalf(s));
            show(secondHalf(s));

            isDupledromeRecursive(firstHalf(s));
            isDupledromeRecursive(secondHalf(s));
        }else{

        }
        return true;
    }
    public static String firstHalf(String s){
        return s.substring(0,(s.length()/2));
    }
    public static String secondHalf(String s){
        return s.substring((s.length()/2), s.length());
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
    public static boolean isDupledromeIterative(String s){
        int index =0;
        if(s.length()%2 != 0){
            return false;
        }
        while(index < s.length()-1){
            if(charcAt(s,index)  != charcAt(s,index+1)){
                return false;
            }
            index = index + 2;
        }
        return true;
    }
    // char a='a',z='z', A='A', Z='Z'; //97 122 65 90
    //half done!
    public static String captainCrunchDecoder(String s, int incrementor){
        int index =0;
        while(index < s.length()){
            char c = charcAt(s,index);
            if(c>96 && c<123){
                //means its in lowercase
                if( (c+incrementor) < 122){
                    s = s.replace(c,(char)(c + incrementor));
                }else{
                    s = s.replace(c,(char)(c + incrementor + 96));
                }
            }
            if(c>64 && c<91){
                //means its in uppercase
            }
            index++;
        }
        return s;
    }
}
