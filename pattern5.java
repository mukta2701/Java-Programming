/* Write Java programs for the patterns given below:
        1
     2 1 2
   3 2 1 2 3
 4 3 2 1 2 3 4
*/
import java.util.Scanner;

public class pattern5 {
    public static void main(String args[]) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of lines");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n - i; j++) {
                System.out.printf("  ");
            }
            for (j = i; j > 0; j--) {
                System.out.printf(" %d", j);
            }
            for (j = 2; j <= i; j++) {
                System.out.printf(" %d", j);
            }

            System.out.println();
        }
    }
}
