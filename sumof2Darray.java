
//Write a program to calculate sum of 2D array
import java.util.Scanner;

public class sumof2Darray {
    public static void main(String args[])
    { 
        int m,n;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        m = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        n= scanner.nextInt();

        int array[][] = new int[m][n];
        System.out.println("Enter the elements of the array: ");

        for(int i= 0; i < m; i++) {
            for(int j= 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
                System.out.println("Elements of the array are: ");
            }
        }
        for (int i = 0; i < m; i++)   
        {   
            for (int j = 0; j < n; j++)   
            { 
                //prints the array elements  
                System.out.print(array[i][j] + " ");   
            }
            System.out.println();
        }
        scanner.close();
    }
}
