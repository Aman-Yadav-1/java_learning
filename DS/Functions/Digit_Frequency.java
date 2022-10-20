package DS.Functions;
import java.util.Scanner;

public class Digit_Frequency {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int d = scan.nextInt();
        
        int f = getDigFreq(n , d);
        
        System.out.println(f + " times");
    }
    
    public static int getDigFreq(int n,int d){
        int rv = 0;
        
        while(n > 0){
            int dig = n % 10;
            n = n / 10;
            
            if(dig == d){
                rv++;
            }
        }
        return rv;
    }
}
