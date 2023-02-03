package gfg_java.Arrays.Basics;

public class threeD_array {
    public static void main(String [] args){
    int[][][]arr={{{1,2},{3,4}},{{5,6},{7,8}}};

    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            for(int k=0;k<2;k++){
                System.out.println("arr["+i+"]"+"arr["+j+"]"+"arr["+k+"]"+"="+arr[i][j][k]);
            }
        }
    }
}
}