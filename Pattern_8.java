
import java.util.Scanner;

public class Pattern_8 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                if(i + j == n + 1){
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
