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

        scan.close();

    }
}