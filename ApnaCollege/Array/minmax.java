import java.util.*;

public class minmax{
    public static void main(String [] args){
        Scanner scan  = new Scanner(System.in);
        int size = scan.nextInt();

        int arr[] = new int [size];

        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Smallest no. in the array is : " + min);
        System.out.println("Largest no. in the array is : " + max);

        scan.close();

    }
}