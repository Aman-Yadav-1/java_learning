package gfg_java.Arrays.setbits;
// alternative of method 3 : Recursive approach

import java.util.*;

public class method4 {
    static int setBits(int n){
        if(n==0){
            return 0;
        }
        else return 1+setBits(n & (n-1));
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(setBits(n));
        scan.close();
    }
}
