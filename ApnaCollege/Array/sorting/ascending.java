package sorting;
import java.util.*;

public class ascending {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int arr[] = new int [size];

        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }

        boolean isAscending =  true;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("Array is in ascending order");
        }
        else{
            System.out.println("Array is in discending order");
        }
        scan.close();
    }
}
