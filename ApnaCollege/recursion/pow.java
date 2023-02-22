package ApnaCollege.recursion;

public class pow {
    public static int calcPower(int x,int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        int xPow_nm1 = calcPower(x, n-1);
        int xPow_n = x * xPow_nm1;
        return xPow_n;
    }
    public static void main(String [] args){
        int x = 2;
        int n = 3;

        System.out.println(calcPower(x, n));
    }
}
