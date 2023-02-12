package two_d_array;
import java.util.*;

public class initialization {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();
        int col = scan.nextInt();

        int arr [][] = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr [i][j]=scan.nextInt();
            }
        }

        scan.close();
    }
}