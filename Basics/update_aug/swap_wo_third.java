import java.util.*;

//swapping without using third num/temp

public class swap_wo_third{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int y = scan.nextInt();

    System.out.println("before swapping: " + x + " & " + y);

    x = x + y;
    y = x - y;
    x = x - y;

    System.out.println("after swapping: " + x + " & " + y);
    scan.close();
  }
}
