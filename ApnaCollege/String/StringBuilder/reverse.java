package ApnaCollege.String.StringBuilder;
import java.util.*;

public class reverse {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scan.next());
        System.out.println(sb.reverse());
        scan.close();
    }
}
