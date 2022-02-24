//Write a program to display the following patterns:

//           1
//     2         3
// 4         5           6
import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows to print the pattern: ");

        int rows = sc.nextInt();

        System.out.println("**Print the following patterns**");

        for(int i =1; i<=rows; i++)
        {
            for(int j = rows; j> i; j++)
            {
                System.out.println(" ");
            }

            for(int k =1; k <=i; k++)
            {
                System.out.println(k + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
