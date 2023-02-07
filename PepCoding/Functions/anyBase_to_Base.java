package PepCoding.Functions;
import java.util.Scanner;

public class anyBase_to_Base {
    public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    
	    int n = scan.nextInt();
	    int b1 = scan.nextInt();
	    int b2 = scan.nextInt();
	    
	    int d = BasetoBase(n , b1, b2);
	    
		System.out.println(d);
        scan.close();
	}
	
	public static int BasetoBase(int n,int b1, int b2){
	    int dec = getValInDec(n , b1);
	    int dn = getValueInBase(dec , b2);
	    
	    return dn;
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
