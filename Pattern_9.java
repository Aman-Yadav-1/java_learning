
import java.util.Scanner;

public class Pattern_9 {
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                if((i + j == n + 1) || (i == j)){
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
