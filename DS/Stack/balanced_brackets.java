package DS.Stack;
import java.util.Scanner;
import java.util.Stack;

public class balanced_brackets {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        Stack<Character> st = new Stack<>();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }

            else if(ch == ')'){
                boolean val = handlingClosing(st, '(');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
            else if(ch == '}'){
                boolean val = handlingClosing(st, '{');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
            else if(ch == ']'){
                boolean val = handlingClosing(st, '[');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
            else{
            }
        }
            if(st.size() == 0){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
    }

    public static boolean handlingClosing(Stack <Character> st,char cooresoch){
        if(st.size() == 0){
            return false;
        }
        else if(st.peek() != cooresoch){
            return false;
        }
        else{
            st.pop();
            return true;
        }
    }
}
