import java.util.Scanner;

//Write a Java program to find maximum of three numbers.

public class maximum {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the first number:");
        a= s.nextInt();
        System.out.print("Enter the second number:");
        b = s.nextInt();
        System.out.print("Enter the third number:");
        c = s.nextInt();
        
        if(a>b && a>c)
        {
            System.out.println("Largest number is:" +a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Largest number is:" +b);
        }
        else
        {
            System.out.println("Largest number is:" +c);
        }
        s.close();
    }
}
