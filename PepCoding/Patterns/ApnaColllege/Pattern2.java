package ApnaColllege;
import java.util.*;
public class Pattern2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i==1 || i==n) || (j==1 || j==n)){
                    System.out.print("*");
                }
                else{
                    System.out.print("");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
