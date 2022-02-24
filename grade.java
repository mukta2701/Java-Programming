import java.util.Scanner;

public class grade {
    public static void main(String args[])
    {
        int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner s = new Scanner(System.in);
		s.close();

        for(i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = s.nextInt();
           total = total + marks[i];
        }
        
        //Calculating average here
        avg = total/6;
        System.out.print("The student Grade is: ");
        if(avg>=90 && avg<80)
        {
            System.out.print("Grade A");
        }
        else if(avg>=80 && avg<70)
        {
           System.out.print("B");
        } 
        else if(avg>=70 && avg<60)
        {
            System.out.print("C");
        }
        else if(avg>=60 && avg<50)
        {
            System.out.print("D");
        }
        else if(avg>=50 && avg<40)
        {
            System.out.print("Grade E");
        }
        else 
        {
            System.out.print("Grade F");
        }
        
    }
}
