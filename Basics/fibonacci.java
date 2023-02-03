package Basics;
import java.util.*;

public class fibonacci {

    static int fib(int n){
        double phi=(Math.sqrt(5)+1)/2;
        return (int) Math.round(Math.pow(phi,n)/(Math.sqrt(5)));
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Fibonacci Number of " + n + " is : " + fib(n));
        scan.close();
    }
}
