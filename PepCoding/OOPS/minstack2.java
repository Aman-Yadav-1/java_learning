// minimum stack with constant space

package PepCoding.OOPS;

import java.io.*;
import java.util.Stack;

public class minstack2 {
    public static class MinStack{
        Stack <Integer> data;
        int min;

        public MinStack(){
            data = new Stack<>();
        }
        int size(){
            return data.size();
        }
        void push(int val){
            if(data.size()==0){
                data.push(val);
                min=val;
            }
            else if(val >= min){
                data.push(val);
            }
            else{
                data.push(val + val - min);
                min = val;
            }
        }
        int pop(){
            if(size()==0){
                System.out.println("stack underflow");
                return -1;
            }
            else{
                if(data.peek()>=min){
                    return data.pop();
                }
                else
                {
                    int ov = min;
                    min = 2*min - data.pop();
                    return ov;
                }
            }
        }
        int top(){
            if(size()==0){
                System.out.println("stack underflow");
                return -1;
            }
            else{
                if(data.peek()>=min){
                    return data.peek();
                }
                else{
                    return min;
                }
            }
        }
        int min(){
            if(size()==0){
                System.out.println("Stack Underflow");
                return -1;
            }
            else{
                return min;
            }
        }

    }
    public static void main(String [] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MinStack st = new MinStack();

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
            str = br.readLine();
        }
    }
}