package ApnaCollege;
import java.util.*;
public class heisenberg {
    public static void sayMyName(String name){
        System.out.println("You're goddamn right !");
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Say My Name : ");
        String name = scan.next();

        sayMyName(name);
        scan.close();
    }
}
