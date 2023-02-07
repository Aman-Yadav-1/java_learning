// MERGE OVERLAPPING

/* 
we will get input as start time and end time for a meeting, we bought to tell which meeting can be merged
that is the timing that are overlapping should get merged together, 
example- there is meeting between 1-8 PM and another between 5-12 , we can merge both to make 1-12 meeting schedule

to merge them keep in mind the end time of meeting should be greater than starting time of another meeting and smaller than end time of 2nd meeting
*/


/* Sorting method - sort merge*/
package PepCoding.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class merge_overlapping {
    public static void main(String [] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for(int j = 0; j<n;j++){
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]); // start point
            arr[j][1] = Integer.parseInt(line.split(" ")[0]); // end point
        }
        mergeInter(arr);
    }

    public static void mergeInter(int [] [] arr){
        Pair[] pairs = new Pair[arr.length];

        for(int i = 0;i < arr.length;i++){
            pairs[i] = new Pair(arr[i][0], arr[i][1]);
        }

        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();

        for(int i = 0;i < pairs.length;i++){
            if(i == 0){
                st.push(pairs[i]);
            }
            else{
                Pair top = st.peek();

                if(pairs[i].st > top.et){
                    st.push(pairs[i]);
                }
                else{
                    top.et = Math.max(top.et, pairs[i].et);
                }
            }
        }

        Stack <Pair> rs = new Stack<>();
        while(st.size()>0){
            rs.push(st.pop());
        }
        while(rs.size() > 0){
            Pair p = rs.pop();
            System.out.println(p.st + " " + p.et);
        }
    }
    public static class Pair implements Comparable<Pair>{
        int st;
        int et;

        Pair(int st, int et){
            this.st = st;
            this.et = et;
        }

        // this > other, return +ve
        // this = other, return 0
        // this < other, return -ve
        
        public int compareTo(Pair other) {
            if(this.st != other.st){
                return this.st - other.st;
            }
            else{
                return this.et - other.et;
            }
        }
    }
}
