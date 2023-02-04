package gfg_java.Arrays;

public class swapBits {
    static int swapBit(int num, int p1, int p2, int n) 
    { 
        int shift1, shift2, value1, value2; 
        while (n-- > 0) 
        { 
          
            // Setting bit at p1 position to 1 
            shift1 = 1 << p1; 
          
            // Setting bit at p2 position to 1 
            shift2 = 1 << p2; 
      
            // value1 and value2 will have 0 if num 
            // at the respective positions - p1 and p2 is 0. 
            value1 = ((num & shift1)); 
            value2 = ((num & shift2)); 
      
            // check if value1 and value2 are different 
            // i.e. at one position bit is set and other it is not 
            if ((value1 == 0 && value2 != 0) || 
                (value2 == 0 && value1 != 0))
            {
              
                // if bit at p1 position is set 
                if (value1 != 0) 
                { 
                  
                    // unset bit at p1 position 
                    num = num & (~shift1);
                  
                    // set bit at p2 position 
                    num = num | shift2; 
                }
              
                // if bit at p2 position is set 
                else 
                {
                  
                    // set bit at p2 position 
                    num = num & (~shift2);
                  
                    // unset bit at p2 position 
                    num = num | shift1; 
                } 
            } 
            p1++; 
            p2++; 
        }
      
        // return final result 
        return num; 
    } 
  
  // Driver code
  public static void main(String[] args) 
  {
    int res = swapBit(28, 0, 3, 2); 
    System.out.println("Result = " + res);
  }
}
