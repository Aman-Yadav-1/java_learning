//statement : 
/*
 Print the spiral order matrix as output for a given matrix of numbers.
 */
package two_d_array;
import java.util.*;

public class spiral {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int arr[][] = new int[n][m];

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                arr[i][j]=scan.nextInt();
            }
        }

        System.out.println("The Spiral of given matrix is : ");

        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int col=colStart;col<=colEnd;col++){
                System.out.print(arr[rowStart][col]);
            }
            rowStart++;

            for(int row=rowStart;row<=rowEnd;row++){
                System.out.print(arr[row][colEnd]);
            }
            colEnd--;

            for(int col=colEnd;col>=colStart;col--){
                System.out.print(arr[rowEnd][col]);
            }
            rowEnd--;

            for(int row=rowEnd;row>=rowStart;row--){
                System.out.print(arr[row][colStart]);
            }
            colStart++;
            System.out.println();
        }
        scan.close();
    }
}
