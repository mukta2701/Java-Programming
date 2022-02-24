import java.util.*;  

class Swap {  
    public static void main(String[] args) {  
       int x, y, t;// x and y are to swap   
       Scanner in = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       x = in.nextInt();  
       y = in.nextInt();  
       System.out.println("Before swapping numbers: "+x +"  "+ y);  
       /*swapping */  
       t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping numbers: "+x +"   " + y);  
       System.out.println( );  
       in.close();

    }    
}  
