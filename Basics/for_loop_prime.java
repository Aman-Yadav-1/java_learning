package Basics;
import java.util.Scanner;

public class for_loop_prime {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int t = scan.nextInt();
            for(int i=0;i<t;i++){
                int n = scan.nextInt();
                
                int count = 0;
                for(int div=1;div<=n;div++){
                    if(n % div == 0){
                    count++;
                   }
                   if(count==2){
                     System.out.println("Prime");
                   }
                   else{
                     System.out.println("Non-prime");
                   }
                }
            }
        }
   }
}
