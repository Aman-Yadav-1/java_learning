/* Celebrity problem */

/* Celebrity - Known by everybody,knows no one
 knows no one = 0, knowns = 1
 */
/*  
    0  1. 1. 1. 1.
    1  0  0  0  1
    1  0  0  1. 0
    0  0  0  0  0
    0  1  0  1. 0
 
 * column 3 is celebrity indexed
 */
package DS.Stack;

import java.util.*;
import java.io.*;

public class celebrity {
    public static void main(String [] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [][] arr = new int[n][n];

        for(int j = 0; j < n; j++) {
            String s[] = br.readLine().split(" ");
            for(int i = 0; i < n; i++) {
                arr[i][j] = Integer.parseInt(s[i]);
            }
        }
        findCelebrity(arr);
    }

    public static void findCelebrity(int [][] arr){
        Stack <Integer> st = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            st.push(i);
        }
        while(st.size() > 1){
            int i = st.pop();
            int j = st.pop();
            if(arr[i][j] == 1){
                st.push(j);
            }
            else{
                st.push(i);
            }
        }
        int pot = st.pop();
        boolean flag  = true;
        for(int i = 0; i < arr.length; i++){
            if(i != pot){
                if(arr[i][pot] == 0 || arr[pot][i] == 1){
                    flag = false;
                    break;
                }
            }
        }
    }
}
