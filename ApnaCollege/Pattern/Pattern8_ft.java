package ApnaCollege.Pattern;
//ft = Floyd's Triangle
import java.util.*;

public class Pattern8_ft {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int val = 1;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
        scan.close();
    }
}
