package DS.Functions;
import java.util.Scanner;

public class anyBase_to_Dec {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int b = scan.nextInt();
        
        int d = getValInDec(n,b);
        
        System.out.println("the base " + b + " to value " + n + " is : " + d);
    }
    
    public static int getValInDec(int n,int b){
        int rv = 0;
        
        int p = 1;
        while(n > 0){
            int dig = n % 10;
            n = n / 10;
            
            rv += dig * p;
            p = p * b;
        }
        
        
        
        return rv;
    }
}
