package gfg_java.fibonacci_numbers;
// this method will use Dynamic Programming to get fibonacci number
// in this method we are reducing the repeated work done in method1
public class method2 {
    static int fib(int n){
        // declaring array
        int f[] = new int[n+2];
        int i;

        f[0]=0;
        f[1]=1;

        for(i=2;i<=n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }
    public static void main(String [] args){
        int n=9;
        System.out.println(fib(n));
    }
}
