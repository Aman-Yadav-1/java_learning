package Basics;
import java.util.Scanner;

public class for_loop_custom_counting {
    public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();

            System.out.println("The counting is:");
            
            for(int i=1;i<=n;i++){
                System.out.println(i);
            }
        }
		System.out.println("Done.");
    }
    
}
