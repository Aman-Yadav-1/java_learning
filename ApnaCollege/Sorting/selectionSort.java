package ApnaCollege.Sorting;
// selectionSort algorithm
// compare two elements in array and smallest of two get swapped down 

public class selectionSort {
    public static void print(int arr[]){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int arr[] = {7,8,3,4,1,2};

        for(int i = 0;i < arr.length - 1;i++){
            int smallest = i;
            for(int j = i + 1;j < arr.length;j++){ // because smallest  = i, so j = i + 1, as before smallest all might be sorted
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }

            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        print(arr);
    }
}
