import java.util.Scanner;

public class primenumbers {
    public static void main(String[] args) {
        //range
        int min, max;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the min number:");
        min = scanner.nextInt();

        System.out.println("Enter the max number: ");
        max = scanner.nextInt();
        //find all prime numbers in the given range
        for(int n=min;n<=max;n++) {
            //check if this number is prime
            if(isPrime(n)) {
                System.out.println(n);
            }
            scanner.close();
        }
    }
    
    public static boolean isPrime(int num) {    
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
