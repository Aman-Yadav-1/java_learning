package DS.Functions;
import java.util.Scanner;

public class Dec_to_anyBase {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int b = scan.nextInt();
        
        int dn = getValueInBase(n, b);
        
        System.out.println("The value of " + n + " in base "+ b + " is : " + dn);
        scan.close();
    }
    
    
    public static int getValueInBase(int n,int b){
        int rv = 0;
        
        int p = 1;
        
        while(n > 0){
            int dig = n % b;
            n = n / b;
            
            rv += dig*p;
            
            p = p * 10;
        }
        
        return rv;
    }
}
