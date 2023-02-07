package PepCoding.Stack;
import java.util.Stack;
import java.util.Scanner;

public class duplicate_brackets {
    public static void main(String [] args){
        try (Scanner scan = new Scanner(System.in)) {
            String str = scan.nextLine();

            Stack<Character> st = new Stack<>();

            for(int i = 0;i<str.length();i++){
                char ch = str.charAt(i);

                if(ch == ')'){
                    if(st.peek() == '('){
                        System.out.println(true);
                        return;
                    }
                    else{
                        while(st.peek() != '('){
                            st.pop();
                        }
                        st.pop();
                    }
                }
                else{
                    st.push(ch);
                }
            }
        }

        System.out.println(false);
    }
}