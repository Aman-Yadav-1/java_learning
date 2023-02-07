//next greater element to the right -- in stack solution 
package PepCoding.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class ngetr_alt {
    public static void display(int [] a){
        StringBuilder sb = new StringBuilder();
        for(int val:a){
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }
    public static void main(String [] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];

        for(int i = 0;i<n;i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int [] nge = solve(a);
        display(nge);
    }
    public static int[] solve(int [] arr){
        int [] nge = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i = 1;i<arr.length;i++){
            while(st.size() > 0 && arr[i] > arr[st.peek()]){
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size() > 0){
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
    }

}
