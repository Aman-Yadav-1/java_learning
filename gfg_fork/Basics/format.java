package gfg_fork.Basics;
import java.util.*;

public class format {

static class Geeks{
    
    static void printInFormat(float a, float b){
        float result = a/b;
        
        
        // Your code here to print upto 3 decimal places
        System.out.format("%.7f " ,result);
        System.out.format("%.3f", result);
    }    
    
}

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		//taking input using class Scanner
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int testcases = sc.nextInt();
		
		while(testcases-- > 0){
		    
		    //taking 2 variables a,b
    		float a = sc.nextFloat();
    		float b = sc.nextFloat();
    		
    		//creating an object of class Geeks
    		Geeks g = new Geeks();
    		
    		//calling printInFormat() method
    		//of class Geeks
    		Geeks.printInFormat(a, b);
    		System.out.println();
		
		}
	}
}