// Linear Search Method
package Searching;
import java.util.*;

public class method1 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }

        int x = scan.nextInt();

        for(int i = 0;i<size;i++){
            if(arr[i]==x){
                System.out.println(i);
            }
        }

        scan.close();
    }
}
