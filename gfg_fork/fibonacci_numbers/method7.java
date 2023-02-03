//best method in my opinion
package gfg_fork.fibonacci_numbers;

//in this we will use Fn = {[(√5 + 1)/2] ^ n} / √5 

public class method7 {
    static int fib(int n){
        double phi = (1+ Math.sqrt(5))/2;
        return (int) Math.round(Math.pow(phi,n)/Math.sqrt(5));
    }
    public static void main(String [] args){
        int n = 9;
        System.out.println(fib(n));
    }
}