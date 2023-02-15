package ApnaCollege.Sorting;

// take biggest number and push it at end of the array
// if element at index i is greater than element at i+1 push it after it

public class bubbleSort{
    public static void print(int arr[]){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int arr[] = {8,3,7,2,1};

        for(int i = 0; i < arr.length - 1;i++){ 
            for(int j = 0;j < arr.length - i - 1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        print(arr);
    }
}