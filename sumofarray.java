//Write a java program to calculate Sum and Average of an integer array.

import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args)
    {
        int array[]= new int[10];
        int n;
        int sum= 0;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        n = scanner.nextInt();
        System.out.println("Enter the elements of the array: ");
        
        for(int i=0; i<n; i++) {
            array[i]= scanner.nextInt();
            sum = sum + array[i];
        }
        System.out.println("Sum of the elements of the array: " +sum);
        scanner.close();
    }
}
