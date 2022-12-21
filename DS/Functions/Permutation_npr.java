package DS.Functions;
import java.util.Scanner;

public class Permutation_npr {
    public static int fact(int x){
        int rv = 1;
        
        for(int i = 1;i <= x;i++){
            rv = rv * i;
        }
        
        return rv;
    }
    
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int r = scan.nextInt();
        
        
        int nfact = fact(n);
        int nmrfact = fact(n - r);
        
        int npr = nfact / nmrfact;
        
        System.out.println(n + "p" + r + " = " + npr);
        scan.close();
    }
}
