//Write a Java program to calculate factorial of a number.

import java.util.Scanner;

public class factorial 
{
    static int fact(int n)
    {
        if (n==0) 
        {
            return 1;    
        } 
        
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        num=s.nextInt();
        s.close();
        System.out.println("Factorial of "+ num + " is " + fact(num));
        
    }
}