import java.util.Scanner;

public class Pattern_14 {
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
        
        for(int i = 1;i <= 10; i++){
            int val = x * i;
            
            System.out.println(x + " * " + i + " = " + val);
            
        }
        scan.close();
    }
}
