package PepCoding;
import java.util.Scanner;

public class Pattern_20 {
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= n;j++){
                if(j == 1 || j == n){
                    System.out.print("*\t");
                }
                else if(i > n / 2 && (i == j || i + j == n + 1)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            
            System.out.println();
        }
        scan.close();
    }
}
