//Write a Java program to reverse a number

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int number;
        int rev=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number:");
        number = s.nextInt();
        s.close();
        while (number != 0) {
            int remainder = number % 10;
            rev = rev * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The reverse of the given number is: " + rev);
    }
}
