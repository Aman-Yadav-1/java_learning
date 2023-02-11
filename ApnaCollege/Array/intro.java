import java.util.*;

public class intro {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        scan.close();
    }
}
