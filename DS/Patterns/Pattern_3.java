import java.util.Scanner;

public class Pattern_3 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int space = n - 1;
        int star = 1;
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= star; j++){
                System.out.print("*\t");
            }
            space--;
            star++;
            
            System.out.println();
        }
        scan.close();
    }
}
