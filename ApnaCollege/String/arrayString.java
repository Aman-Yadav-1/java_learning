package ApnaCollege.String;
import java.util.*;

public class arrayString {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        String arr[] = new String[size];

        int len = 0;

        for(int i=0;i<size;i++){
            arr[i] = scan.next();
            len += arr[i].length();
        }

        System.out.println(len);
        scan.close();
    }
}
