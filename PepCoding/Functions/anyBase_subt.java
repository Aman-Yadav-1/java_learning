package PepCoding.Functions;
import java.util.Scanner;

public class anyBase_subt {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int b = scan.nextInt();
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int d = getDiff(b,n1,n2);
		System.out.println(d);
		scan.close();
	}
	
	
	public static int getDiff(int b,int n1,int n2){
	    int rv = 0;
	    
	    int c = 0;
	    int p = 1;
	    
	    while(n2 > 0){
	        int d1 = n1 % 10;
	        n1 = n1 / 10;
	        int d2 = n2 % 10;
	        n2 = n2 / 10;
	        
	        int d = 0;
	        d2 = d2 + c;
	        
	        if(d2 >= d1){
	            c = 0;
	            d = d2 - d1;
	        }
	        else{
	            c = -1; 
	            d = d2 + b - d1;
	        }
	        
	        rv = rv + d * p;
	        p = p * 10;
	    }
	    
	    return rv;
	}
}
