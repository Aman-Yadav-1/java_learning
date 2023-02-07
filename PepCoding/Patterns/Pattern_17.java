package PepCoding.Patterns;

import java.util.Scanner;

public class Pattern_17 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int space = n / 2;
        int star = 1;
        
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= space;j++){
                if(i == n / 2 + 1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            
            for(int j = 1;j <= star;j++){
                System.out.print("*\t");
            }
            
            
            if(i <= n / 2){
                star++;
            }
            else{
                star--;
            }
            
            System.out.println();
        }
        scan.close();
    }
}
