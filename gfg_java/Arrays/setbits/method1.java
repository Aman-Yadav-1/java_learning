/*Simple Method Loop through all bits in an integer, 
check if a bit is set and if it is, 
then increment the set bit count. 
See the program below.  */

package gfg_java.Arrays.setbits;

public class method1 {
    static int setBits(int n){
        int count=0;
        while(n>0){
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
    public static void main(String [] args){
        int i = 8;
        System.out.println(setBits(i));
    }
}
// Time Complexity: O(logn)
// Auxiliary Space: O(1)