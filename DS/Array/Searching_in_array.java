package DS.Array;
import java.util.Scanner;

public class Searching_in_array {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        System.out.println();
        
        int [] arr = new int[n];
        for(int i = 0;i < arr.length;i++){
            arr[i] = scan.nextInt();
        }
        
        System.out.println();
        
        int data = scan.nextInt();
        int idx = -1;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == data){
                idx = i;
                break;
            }
        }
        
        System.out.println(data + " is at " + idx);
    }
}
