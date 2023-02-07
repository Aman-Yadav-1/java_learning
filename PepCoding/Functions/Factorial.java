package PepCoding.Functions;
import java.util.Scanner;

public class Factorial {
    public static int fact(int x){
        int rv = 1;
        for(int i = 1;i <= x;i++){
            rv = rv * i;
        }
        
        return rv;
    }
        
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
            
        int n = scan.nextInt();
            
        int nfact = fact(n);
            
        System.out.println(n + "! = " + nfact);
        scan.close();
    }
}
