package PepCoding.OOPS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class minstack {
    public static class MinStack{
        Stack <Integer> allData;
        Stack<Integer> minData;
        public MinStack(){
            allData = new Stack<>();
            minData = new Stack<>();
        }
        int size(){
            return allData.size();
        }
        void push(int val){
            allData.push(val);
            if(minData.size() == 0 || val <= minData.peek()){
                minData.push(val);
            }
        }
        
        int pop(){
            if(size() == 0){
                System.out.println("Stack Undeflow");
                return -1;
            }
            else{
                int val = allData.pop();

                if(val == minData.peek()){
                    minData.pop();
                }
                return val;
            }
        }
        
        int top(){
            if(size() == 0){
                System.out.println("Stack Undeflow");
                return -1;
            }
            else{
                return allData.peek();
            }
        }
        
        int min(){
            if(size() == 0){
                System.out.println("Stack Undeflow");
                return -1;
            }
            else{
                return minData.peek();
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
