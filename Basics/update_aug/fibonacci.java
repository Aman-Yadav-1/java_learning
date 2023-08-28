import java.util.*;

public class fibonacci {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt(), a = 0, b = 0, c = 1;

        for(int i = 0;i < num; i++){
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + "");
        }
        scan.close();
    }
}
