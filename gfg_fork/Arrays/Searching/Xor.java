package gfg_fork.Arrays.Searching;

// Applying ^ 
// where number ^ number=0, number ^ 0=number

public class Xor {
    static int one(int arr[],int arr_size){
        int res = arr[0];
        for(int i = 1;i<arr_size;i++){
            res = res ^ arr[i];
        }
        return res;
    }
    public static void main(String [] args){
        int arr[] = {3,4,3,5,4,2,5};
        int n = arr.length;
        System.out.println("Element that is occuring only once is : " + one(arr,n) + " ");
    }
}
