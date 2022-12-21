package DS.Array;

public class Swap_two_var {
    public static void swap (int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String [] args){
        int [] arr = {22,33,44,57,23};
        
        swap(arr,1,3);
        
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
