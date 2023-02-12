package ApnaCollege.String;
import java.util.*;

public class intro{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String fullName = "Aman Yadav";
        System.out.println(fullName.length());
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i));
        }
        scan.close();
    }
}