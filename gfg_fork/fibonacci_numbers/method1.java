package gfg_fork.fibonacci_numbers;

//fibonacci = precedor + successor= new successor
//finomacci numbers : 0 1 1 2 3 5 8 13 21 34 55
//Index :             0 1 2 3 4 5 6 7  8  9  10 


public class method1 {
    static int fib(int n){
        if(n<=1)
            return n;
            return fib(n-1)+fib(n-2);
    }
    public static void main(String [] args){
        int n = 9; //change for other outputs
        System.out.println(fib(n));
    }
}

//Time Complexity: O(n) ; considering function call stack size
// O(1) ;Otherwise