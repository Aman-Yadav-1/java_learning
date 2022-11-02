package DS.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class postfix {
    public static void main(String [] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack <Integer> vs = new Stack<>();
        Stack <String> is = new Stack<>();
        Stack <String> ps = new Stack<>();

        for(int i = 0;i < exp.length();i++){
            char ch = exp.charAt(i);

            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v2 = vs.pop();
                int v1 = vs.pop();
                int val = operation(v1,v2,ch);

                vs.push(val);
            }
            else{
                vs.push(ch - '0');
                is.push(ch + "");
                ps.push(ch + "");
            }
        }
    }
    public static int operation(int v1, int v2 , char ch){
        if(op == '+'){
            return v1 + v2;
        }
        else if(op == '-'){
            return v1 - v2;
        }
        else if(op == '*'){
            return v1 * v2;
        }
        else{
            return v1 / v2;
        }
    }
}
