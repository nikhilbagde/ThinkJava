/**
 * Created by Nikhil on 5/27/2016.
 */
public class Enigma {

        public static void enigma(int x) {
            if (x == 0) {               //x=5 -> | x=2 | x=1 | x=0 return
                return;
            } else {
                enigma(x/2);            //x=2    | x=1 | x=0 |
            }
            System.out.print(x%2);  // 3.sout(5%2)=1 <- 2.sout(2%2)=0 <- 1.sout(1%2)=1
        }
        public static void main(String[] args) {
            enigma(5);
            System.out.println("");
        }

}
