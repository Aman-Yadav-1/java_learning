package ApnaCollege.recursion;
// stack height is n

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
        int x = 5;
        int n = 3;

        int ans = calcPower(x, n);

        System.out.println(ans);
    }
}
