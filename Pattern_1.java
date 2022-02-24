/*1####
  2###
   3##
    4#
     5 
*/
import java.util.Scanner;

public class Pattern_1 {
    public static void main(String args[])
 { 
 int i,j,k,n;
 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of rows");
     n = sc.nextInt();
    
     for (i = 1; i <= n; i++)
        {
            // loop for printing space
            for (j = 1; j < i; j++) {
                System.out.print(' ');
            }
 
            // loop for printing '*'
            for (k = i; k <= n; k++) {
                System.out.print('#');
            }
 
            // move to the next line
            System.out.print(System.lineSeparator());
        }
 }
}
