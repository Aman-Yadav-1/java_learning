// Subset array sum by generating all the subsets
package gfg_java.Arrays;


public class sub_arr_sum {
    static void sub(int arr[], int length,int s){
    for(int i = 0; i<=Math.pow(2,length); i++){
            int sum = 0;
            for(int j = 0;j < length;j++){
                if(((i >> j) & 1) % 2 == 1){
                    sum += arr[j];
                }
            }
            if(sum == s){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    
    public static void main(String [] args){
        int sum = 5;
        int arr[] = {-1,2,4,121};
        int length = arr.length;
        sub(arr,length,sum);
    }
}
