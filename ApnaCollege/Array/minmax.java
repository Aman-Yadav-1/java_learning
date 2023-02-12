import java.util.*;

public class minmax{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int arr[] = new int[size]; // input array size

        for(int i = 0;i<size;i++){
            arr[i] = scan.nextInt(); // input array elements
        }

        int min = Integer.MAX_VALUE; // remember MAX_VALUE for min
        int max = Integer.MIN_VALUE; // and MIN_VALUE for max

        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i]; // update min with arr[i]
            }
            if(arr[i] > max){
                max = arr[i]; //update max with arr[i]
            }
        }


        System.out.println("Smallest Number in array is : " + min);
        System.out.println("Largest Number in array is : " + max);

        scan.close();
    }
}