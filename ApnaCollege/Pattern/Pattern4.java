package ApnaCollege.Pattern;
import java.util.*;
public class Pattern4 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=n;i>1;i--){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        scan.close();
    }
}