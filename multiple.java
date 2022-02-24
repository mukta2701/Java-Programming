//Write a Java program to print all multiple of 5 between a given interval.

public class multiple {
    public static void main(String[] args) 
    {
        System.out.println("Multiples of 5 are:");
        for (int i=0; i<=50; i++)
        {
            if(i%5==0)
            {
                System.out.print(i+" ");
            }
        }
        
    }
}
