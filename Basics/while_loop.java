package Basics;
import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
            int i = scan.nextInt();
            
            while(i<=9){
                System.out.println(i);
                i++;
            }
        }
		System.out.println("Done.");
	}
}
