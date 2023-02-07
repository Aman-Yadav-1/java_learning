
import java.util.Scanner;
public class Pattern21
{
   public static void main(String[] args)
   {
      int a, b, x, y;
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter number of rows to print pattern: ");
      int rows = sc.nextInt();
      
      for(a = rows; a >= 1; a--)
      {
         if(a % 2 == 0)
         {
            x = 0;
            y = 1;
         }
         else
         {
            x = 1;
            y = 0;
         }
         for(b = 1; b <= a; b++)
         {
            if(b % 2 == 0)
            {
               System.out.print(x);
            }
            else
            {
               System.out.print(y);
            }
         }
         System.out.println(" ");
         sc.close();
      }
   }
}
