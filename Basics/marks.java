package Basics;
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
	    try (Scanner scan = new Scanner(System.in)) {
            int m = scan.nextInt();
            
            if(m>90)
            {
                System.out.println("Excellent");
            }
            else if(m>80 && m<=90)
            {
                System.out.println("Good");
            }
            else if(m>70 && m<=80)
            {
                System.out.println("Fair");
            }
            else if(m>60 && m<=70)
            {
                System.out.println("Meet Expectations");
            }
            else{
                System.out.println("Below Par");
            }
        }
}
}
