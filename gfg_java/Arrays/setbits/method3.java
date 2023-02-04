//Brian Kernighan's Algorithm

package gfg_java.Arrays.setbits;
import java.util.*;

public class method3 {
    static int setBits(int n){
        int count=0;

        while(n>0){
            n &= n-1;
            count++;
        }
        return count;
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("The number of setBits present are : " + setBits(n));
        scan.close();
    }
}
