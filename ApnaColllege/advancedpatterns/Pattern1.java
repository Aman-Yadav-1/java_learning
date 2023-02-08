//Butterfly pattern
import java.util.*;

public class Pattern1 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int space = n+2;
        int star = 1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }

            if(i<=n/2){
                star++;
                space-=2;
            }
            else{
                star--;
                space+=2;
            }
            System.out.println();
        }
        scan.close();
    }
}
