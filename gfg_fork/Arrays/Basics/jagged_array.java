/*Jagged array referes to a array that consists of different rows that have a different columns in them
 * Like first row has 2 columns
 * 2nd row has 3 columns
*/
package gfg_fork.Arrays.Basics;

public class jagged_array {
    public static void main(String[] args){
        int arr[][] = new int[2][];
        
        arr[0] = new int[3];
        arr[1] = new int[2];
        
        int count=0;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j]=count++;
            }
        }
        System.out.println("Content Of Jagged Array");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
