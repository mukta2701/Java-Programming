//Write a Java program to check whether a given number is Armstrong Number or not.
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {

        int number, originalNumber, remainder, result = 0, n = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = sc.nextInt();

        originalNumber = number;

        sc.close();

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;


        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }


        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
        
        
    }
}
