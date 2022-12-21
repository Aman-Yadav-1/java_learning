package DS.Array;
import java.util.Scanner;

public class Span_of_array {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int [] arr = new int[n];
        
        for(int i = 0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        
        for(int i = 1;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        int span = max - min;
        
        System.out.println("Span is " + span);
        scan.close();
    }
}
