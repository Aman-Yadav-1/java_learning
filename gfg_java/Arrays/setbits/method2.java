// Recursive Approach for the problem
package gfg_java.Arrays.setbits;

import java.util.*;
public class method2 {
    static int setBits(int n){
        if(n==0){
            return 0;
        }
        else{
            return (n & 1) + (n >>= 1);
        }
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("The number of setBits present are : " + setBits(n));
        scan.close();
    }
}
