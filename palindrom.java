//Write a Java program to check whether a number is palindrome or not.
import java.util.Scanner;

public class palindrom {
    public static void main(String args[]){  
        int num, reversedNum = 0, remainder;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        
        // store the number to originalNum
        int originalNum = num;
        
        // get the reverse of originalNum
        // store it in variable
        while (num != 0) {
          remainder = num % 10;
          reversedNum = reversedNum * 10 + remainder;
          num /= 10;
        }
        
        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
          System.out.println(originalNum + " is Palindrome.");
        }
        else {
          System.out.println(originalNum + " is not Palindrome.");
      }  
      sc.close();
    }
}
