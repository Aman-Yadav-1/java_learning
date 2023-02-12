package two_d_array;
import java.util.*;

public class searching {
    public static void main(String [] args){
        Scanner scan  = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();

        int arr[][] = new int[row][col];

        for(int i = 0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=scan.nextInt();
            }
        }

        int x = scan.nextInt();

        for(int i = 0;i<row;i++){
            for(int j = 0;j < col;j++){
                if(arr[i][j]==x){
                    System.out.print(x + " is at location : " + i + "," + j);
                }
            }
            System.out.println();
        }

        scan.close();
    }
}
