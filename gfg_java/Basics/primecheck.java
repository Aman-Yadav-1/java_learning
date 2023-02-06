//This is a pseudo code to check for prime
package gfg_java.Basics;
public class primecheck {
    static int val=0;
    static void isPrime(int n) {
        if(n<=1){
               System.out.println("No");
               return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {

            if(n%i==0){
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
       
    }   
}
