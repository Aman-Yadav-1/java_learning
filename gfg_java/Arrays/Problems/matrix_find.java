package gfg_java.Arrays.Problems;

public class matrix_find {
    //pseudo code of the problem
    static int columnWithMaxZero(int a[][],int n){
        
        // Your code here
        int val=0; 
        int indx=0; //index variable
        for(int i=0;i<n;i++){
            int count=0;           
            for(int j=0;j<n;j++) {
                if(a[j][i]==0) 
                    count++;
                if(val<count) {
                    val=count;
                    indx=i;
                }
            }
        }
        return indx;
        
    }
}
