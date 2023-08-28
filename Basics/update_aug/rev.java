import java.util.*;

public class rev{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String [] rev = str.split("");
    for(int i = str.length()-1;i>=0;i--){
      System.out.print(rev[i]);
    }
    scan.close();
  }
}
