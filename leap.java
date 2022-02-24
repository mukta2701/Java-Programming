//Write a Java program to check whether a year is leap year or not.
import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        int year;
        Scanner s = new Scanner(System.in);
    	System.out.println("Enter any Year:");
    	year = s.nextInt();
    	s.close();
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }

}
