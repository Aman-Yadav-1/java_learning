package gfg_java.Arrays.Searching;
import java.util.*;

public class binarysearch {

    static int one(int arr[],int n){
        int low = 0;
        int high = n - 2;
        int mid;

        while(low <= high){
            mid = (low+high)/2;
            
            if(arr[mid]==arr[mid^1]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return arr[low];
    }
    public static void main(String [] args){
        int arr[] = {7,2,3,4,2,3,4,5,5};
        int size = arr.length;
        Arrays.sort(arr);

        System.out.println(one(arr,size));
    }
}

//Time Complexity: O(nlogn)
//Auxiliary Space: O(1)