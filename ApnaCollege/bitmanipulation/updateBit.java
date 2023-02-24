package ApnaCollege.bitmanipulation;
import java.util.*;
//both clear & set bit will be performed in this

public class updateBit {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int n = 5;
        int bm = 1<<1;

        int operation = scan.nextInt();
        if(operation==1){
            int newNum=bm|n;
            System.out.println(newNum);
        }
        else{
            int newNum = (~bm) & n;
            System.out.println(newNum);
        }

        scan.close();
    }
}
