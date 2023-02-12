// Problem Statement : 

/*
    Input a string from the user. 
    Create a new string called ‘result’ in which you will replace the letter ‘e’ 
    in the original string with letter ‘i’. 
 */
package ApnaCollege.String;
import java.util.*;

public class replacing {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = "";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result+='i';
            }
            else{
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
        scan.close();
    }
}
