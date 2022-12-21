import java.util.Scanner;

public class Pattern_11 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int val = 1;
        int n = scan.nextInt();
        
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
            System.out.print(val + "\t");
            val++;
            }
        System.out.println();
        }
        scan.close();
    }
}
