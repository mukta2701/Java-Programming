//Write a Java program to find area and perimeter of a rectangle.

import java.util.Scanner;

public class rectangle 
{
    public static void main(String[] args) 
    {
        int l, b, perimeter, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of rectangle:");
        l = s.nextInt();
        System.out.print("Enter breadth of rectangle:");
        b = s.nextInt();
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle:"+perimeter);
        area = l * b;
        System.out.println("Area of rectangle:"+area);
        s.close();
    }
}