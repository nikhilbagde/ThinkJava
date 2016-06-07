/**
 * Created by Nikhil on 5/28/2016.
 */
public class ArrayOperations {
    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+5 ;
        }
        printArray(cloneArray(array));
    }
    public static int[] cloneArray(int[] array){
        int[] clone = new int[array.length];
        for (int i = 0; i < array.length ; i++) {
            clone[i] = array[i];
        }
        return clone;
    }
    public static void show(String s){
        System.out.println(s);
    }
    public static void printArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            show(array[i]);
        }
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
    public static void show(Object o){
        System.out.println(o);
    }
    public static void show(){
        System.out.println();
    }

}
