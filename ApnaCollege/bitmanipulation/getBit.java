package ApnaCollege.bitmanipulation;
import java.util.*;

public class getBit {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 2;
        int bm = 1<<i; 
        // Explanation: 
        // 1 in binary is 0001 , 
        // we are using << that left shift by i, 
        // since i=2, 0001 shifts left by 2, 
        // become 0100 i.e. 4 in decimals

        if((bm & n)==0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }
        scan.close();
    }
}
