import java.util.*;

public class pattern2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int star=n;

        for(int i=1;i<=n;i++){
            int space=n-i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            space--;
            System.out.println();
        }
        scan.close();
    }
}
