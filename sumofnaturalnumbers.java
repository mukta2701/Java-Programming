//Sum of n Natural numbers using while loop and for loop
/* NAME: MUKTA CHOUDHURY
    BCA-B
    A91404819066
*/
/*
import java.util.Scanner;

public class sumofnaturalnumbers {
    public static void main(String[] args) {
        int num1, num2;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sum from: ");
        num1 = scanner.nextInt();
        System.out.println("Sum to: ");
        num2 = scanner.nextInt();
        
        //while loop

        while (num1 <= num2) {
            // adding the value of i into sum variable
            sum = sum + num1;
            // increments the value of i by 1
            num1++;
        }
        System.out.println("Sum of Natural Numbers = " + sum);  
        scanner.close();
    }
}
*/
/***************************************************************************/

//using For loop

/* NAME: MUKTA CHOUDHURY
    BCA-B
    A91404819066
*/

import java.util.Scanner;

public class sumofnaturalnumbers {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = scanner.nextInt();

        for(int i=1 ;i<=number;i++)
        {
            sum += i;
        }
        System.out.println("Sum of Natural Numbers = " + sum);  
        scanner.close();
    }
}