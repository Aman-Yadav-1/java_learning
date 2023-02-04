package gfg_java.Arrays.setbits;
// alternative of method 3 : Recursive approach

import java.util.*;

public class method3_2 {
    static int setBits(int n){
        if(n == 0){
            return 0;
        }
        else
        return 1 + setBits(n & (n-1));
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println("The number of SetBits present are : " + setBits(n));

        scan.close();
    }
}
// Time Complexity: O(logn)
// Auxiliary Space: O(1)