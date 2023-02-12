package ApnaCollege.String.StringBuilder;
import java.util.*;

public class reverse {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.next());

        for(int i=0;i<sb.length()/2;i++){
            int front  = i;
            int back = sb.length() - 1 -i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);

        scan.close();
    }
}
