import java.util.*;

public class palindrome{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    String rev="", str=scan.nextLine();

    for(int i = str.length()-1;i>=0;i--){
      rev=rev+str.charAt(i);
    }
    System.out.println("reversed string is: " + rev);

    if(str.equals(rev)){
      System.out.println(" is palindrome");
    }
    else{
      System.out.println(" is not palindrome");
    }
    scan.close();
  }
}
