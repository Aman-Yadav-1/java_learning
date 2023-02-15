package ApnaCollege.Sorting;
// Insertion Sorting Algorithm
// In this we divide array in two parts, sorted and unsorted part
// we assume one element of at leftmost side to be in sorted array and rest in unsorted
// we compare each and everyelement from unsorted with sorted one, and place unsorted as per its ability

public class insertionSort {
    public static void print(int arr[]){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String [] args){
        int arr[] = {7,8,4,2,3,1};

        for(int i = 1;i < arr.length;i++){
            int current  = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        print(arr);

    }
}
