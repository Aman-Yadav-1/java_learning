package gfg_fork.Arrays.Searching;

/* Explanation
Applying ^ 
where number ^ number=0, number ^ 0=number
if res is 7 than 7 = 7 ^ (3 ^ 3) ^ (4 ^ 4) ^ (5  ^ 5)
7 = 7 ^ 0 ^ 0 ^ 0 ^ 0
7 = 0
therefore 7 is only once occuring element 
*/

//Program :

public class Xor {
    static int one(int arr[],int arr_size){
        int res = arr[0];
        for(int i = 1;i<arr_size;i++){
            res = res ^ arr[i];
        }
        return res;
    }
    public static void main(String [] args){
        int arr[] = {3,2,4,2,3,4,5};
        int n = arr.length;
        System.out.println("Element occuring only once is : " + one(arr,n) + " ");
    }
}

//Time Complexity : O(n)
//Space : O(1)