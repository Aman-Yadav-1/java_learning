//Problem Statement:
/*
 Input an email from the user. 
 You have to create a username from the email by deleting the part that comes after ‘@’. 
 Display that username to the user.
 */

package ApnaCollege.String;
import java.util.*;

public class delete {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        String username = "";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='@'){
                break;
            }
            else{
                username += str.charAt(i);
            }
        }
        System.out.print(username);

        scan.close();
    }
}
