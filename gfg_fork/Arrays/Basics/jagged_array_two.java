package gfg_fork.Arrays.Basics;

public class jagged_array_two {
    public static void main(String[] args){
        int r = 5;

        // creating array with 5 rows
        int arr[][]=new int[r][];

        //making array-row increment every time
        for(int i=0;i<arr.length;i++){
            arr[i]=new int[i+1];
        }

        //initalizing 2D array
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=count++;
            }
        }

        System.out.println("Contents of jagged Array");

        //incrementing elements present in rows
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}