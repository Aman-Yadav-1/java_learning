package gfg_java.Basics;
import java.util.*;

public class Taking_input {

class Geeks{
    
    // Function to take input using Scanner class
    static void IOFunction(){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    // Your code here
		    int a = sc.nextInt();
		    float b = sc.nextFloat();
		    long c = sc.nextLong();
		    byte d = sc.nextByte();
		    sc.nextLine();
		    String s = sc.nextLine();
		    
		    System.out.println(a);
		    System.out.println(b);
		    System.out.println(c);
		    System.out.println(d);
		    System.out.println(s);
		
		}
		sc.close();
    }
    
}

//{ Driver Code Starts.


    public static void main (String[] args) {
		   Geeks.IOFunction();
	}
}