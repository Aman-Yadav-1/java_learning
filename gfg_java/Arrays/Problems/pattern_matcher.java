package gfg_java.Arrays.Problems;

public class pattern_matcher {
    static void follPatt(String s)
    {
        //Your code here
        int count = 0;
        for(int i=0 ; i<s.length() ; )
        {
            while(i<s.length() && s.charAt(i)=='x')
            {
                count++; // if there is 1 x, count is 1
                i++; //move to next character
            }
            while(i<s.length() && s.charAt(i) == 'y')
            {
                count--; // if there is 1 y after 1 x, count will decrease by 1 as x=y, condition is satisfied.
                i++;
            }
            if(count != 0) // if count is not 0 means  count of X != count of Y
            {
                System.out.println("0"); // since pattern isn't valid, output 0
                break;
            }
        }
            if(count == 0)
            {
                System.out.println("1"); // pattern valid meaning countX=countY, output 1
            }
    }
}
