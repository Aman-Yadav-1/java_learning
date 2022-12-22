// building a normal stack using OOPs concepts
package DS.OOPS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class buildstack {
    public static class customStack{
        int [] data;
        int tos;
        public customStack(int cap){
            data = new int[cap];
            tos = -1;
        }
        int size(){
            return tos+1;
        }
        void display(){
            for(int i = tos;i >= 0;i--){
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
        void push(int val){
            if(tos == data.length - 1){
                System.out.println("Stack Overflow");
            }
            else{
                tos++;
                data[tos] = val;
            }
        }
        int pop(){
            if(tos == -1){
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
                int val = data[tos];
                tos--;
                return val;
            }
        }
        int top(){
            if(tos == -1){
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
                int val = data[tos];
                return val;
            }
        }
    }
    public static void main(String [] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        customStack st = new customStack(n);

        String str = br.readLine();
        while(str.equals("quit") == false){
            if(str.startsWith("push")){
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            }
            else if(str.startsWith("pop")){
                int val = st.pop();
                if(val!=-1){
                    System.out.println(val);
                }
            }
            else if(str.startsWith("top")){
                int val = st.pop();
                if(val != -1){
                    System.out.println(val);
                }
            }
            else if(str.startsWith("size")){
                System.out.println(st.size());
            }
            else if(str.startsWith("display")){
                st.display();
            }
            str = br.readLine();
        }
    }
}