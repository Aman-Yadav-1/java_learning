
import java.util.Scanner;

public class Pattern_10 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int os = n / 2;
        int is = -1;
        
        for(int i = 1;i <= n;i++){
            for(int j = 1; j <= os;j++){
                System.out.print("\t");
            }
            
            System.out.print("*\t");
            
            for(int j = 1;j <= is;j++){
                System.out.print("\t");
            }
            
            //for stars
            if(i > 1 && i < n){
                System.out.print("*\t");
            }
            
            //for spaces
            
            if(i <= n / 2){
                os--;
                is += 2;
            }
            else{
                os++;
                is -= 2;
            }
            System.out.println();
        }
        scan.close();
    }
}
