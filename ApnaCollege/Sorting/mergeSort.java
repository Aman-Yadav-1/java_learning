package ApnaCollege.Sorting;
// diving given array into smaller components to perform operation easily
// Divide & Conquer rule

public class mergeSort { 
    // si : starting index, ei : ending index
    
    public static void conquer(int arr[],int si, int mid, int ei){
        int merged[] = new int[ei - si + 1];
    }
    public static void divide(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid, ei);

        conquer(arr,si,mid,ei);
    }
    public static void main(String [] args){
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        System.out.println(arr);
    }  
}