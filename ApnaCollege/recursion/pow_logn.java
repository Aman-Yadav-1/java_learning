package ApnaCollege.recursion;
// optimized method of power question

public class pow_logn {
    public static int calcPow(int x,int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        if(n%2 == 0){
            return calcPow(x, n/2) * calcPow(x, n/2);
        }
        else{
            return calcPow(x, n/2) * calcPow(x, n/2) * x;
        }

    }
    public static void main(String [] args){
        int x = 2;
        int n = 5;

        int res = calcPow(x, n);

        System.out.println(res);
    }
}
