//Butterfly pattern
import java.util.*;

public class Pattern1 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=1;i<=n;i++){
            int space = 2*(n - i);
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int i=n;i>=1;i--){
            int space = 2*(n - i);
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        scan.close();
    }
}
