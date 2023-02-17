package ApnaCollege.recursion;
// Sum of n natural number using recursion

public class sumofn {
    public static void sumNum(int i, int n, int sum){
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sumNum(i+1,n,sum);
    }
    public static void main(String [] args){
        sumNum(1,5, 0);
    }
}
