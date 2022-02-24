//Write a program to compute the value of Euler’s number that is used as the base of natural logarithms. Use the following formula.

//e= 1+ 1/1! +1 /2! + 1/3!+................ 1/n!


import java.util.Scanner;

public class EulersNumber {
    public static void main(String[] args)
    {
        double a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value:");
        a= scanner.nextDouble();

        System.out.println(Math.exp(a));

        scanner.close();
    }
}
