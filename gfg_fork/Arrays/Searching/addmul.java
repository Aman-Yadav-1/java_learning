//not so recommended method
package gfg_fork.Arrays.Searching;
import java.util.*;

// using formula
// x = 2*(sum_of_array_without_duplicates) - (sum_of_array) 

public class addmul {
    // function which find number
    static int singleNumber(int[] nums, int n)
    {
        HashMap<Integer, Integer> m = new HashMap<>();
        long sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++)
        {
            if (!m.containsKey(nums[i]))
            {
                sum1 += nums[i];
                m.put(nums[i], 1);
            }
            sum2 += nums[i];
        }
        // applying the formula.
        return (int)(2 * (sum1) - sum2); 
    }
    public static void main(String args[])
    {
        int[] a = {2, 3, 5, 4, 5, 3, 4};
        int n = 7;
        System.out.println(singleNumber(a,n));

        int[] b = {15, 18, 16, 18, 16, 15, 89};
        System.out.println(singleNumber(b,n));
    }
}
// Time Complexity: O(nlogn)
//Auxiliary Space: O(n)