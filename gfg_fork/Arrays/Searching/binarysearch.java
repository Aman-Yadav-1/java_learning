package gfg_fork.Arrays.Searching;
import java.util.*;

public class binarysearch {

    static int one(int arr[], int n){
        int low = 0;
        int high = n - 2;
        int mid;

        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==arr[mid^1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return arr[low];
    }
    public static void main(String[] args){
        int arr[] = {2,3,5,3,4,2,5,4,7};
        int size = 9;
        Arrays.sort(arr);
        System.out.println(one(arr,size));
    }
}
