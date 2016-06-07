import java.util.Date;

/** EXPECTED OUTPUT:
 * American format:
 Saturday, July 16, 2011
 European format:
 Saturday 16 July, 2011
 */
/**
 * Created by Nikhil on 5/24/2016.
 */
public class Hello {
    public static void printAmerica(String dayS, String monthS, int Date, int year){
        System.out.println("American format:");
        System.out.print( dayS + ", " + monthS + " " + Date + ", " + year );
        System.out.println();
    }
    public static void printEurope(String dayS, String monthS, int Date, int year){
        System.out.println("European format:");
        System.out.print( dayS  + " " + Date + " " + monthS + ", " + year );
        System.out.println();
    }
    public static void main(String[] nikhil) {
        Date date = new Date();
        int Date= date.getDate(), month = date.getMonth(), year = date.getYear()+1900, day = date.getDay();
        String monthS=null, dayS=null;
        switch (month){
            case 1: monthS = "JANUARY"; break;
            case 2: monthS = "FEBRUARY"; break;
            case 3: monthS = "MARCH"; break;
            case 4: monthS = "APRIL"; break;
            case 5: monthS = "MAY"; break;
            case 6: monthS = "JUNE"; break;
            case 7: monthS = "JULY"; break;
            case 8: monthS = "AUGUST"; break;
            case 9: monthS = "SEPTEMBER"; break;
            case 10: monthS = "OCTOBER"; break;
            case 11: monthS = "NOVEMBER"; break;
            case 12: monthS = "DECEMBER"; break;
        }
        switch (day){
            case 1: dayS = "MONDAY"; break;
            case 2: dayS = "TUESDAY"; break;
            case 3: dayS = "WEDNESDAY"; break;
            case 4: dayS = "THURSDAY"; break;
            case 5: dayS = "FRIDAY"; break;
            case 6: dayS = "SATURDAY"; break;
            case 7: dayS = "SUNDAY"; break;
        }
        //printAmerica(dayS, monthS, Date, year);
        //printEurope(dayS, monthS, Date, year);
        int a=100, b=200;
        System.out.println(a +" "+ b);

    }
}


