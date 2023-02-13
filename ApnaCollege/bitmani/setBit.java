package ApnaCollege.bitmani;
import java.util.*;

public class setBit {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1;
        int bm = 1<<i;

        int newNum = bm | n;
        System.out.println("setBit operation gave: " + newNum);
        scan.close();
    }
}
