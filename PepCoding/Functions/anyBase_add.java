package PepCoding.Functions;
import java.util.Scanner;

public class anyBase_add {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int b = scan.nextInt();
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        
        int d = getSum(b,n1,n2);
        System.out.println("addition is : " + d);
        scan.close();
    }
    
    public static int getSum(int b,int n1,int n2){
        int rv = 0;
        
        int c = 0;
        int p = 1;
        while(n1 > 0 || n2 > 0 || c > 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            
            n1 = n1 / 10;
            n2 = n2 / 10;
            
            int d = d1 + d2 + c;
            c = d / b;
            d = d % b;
            
            rv += d * p;
            p = p * 10;
        }
        
        return rv;
    }
}
