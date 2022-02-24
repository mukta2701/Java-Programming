
/*
Write Java programs for the patterns given below:
1
2 3 4
5 6 7 8 9
*/
import java.util.Scanner;

public class patternloop {
    public static void main(String args[]) {
        int i, j, n;
        int k=1;
        int flag = 2;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        n=scanner.nextInt();
        for(i=0 ; i<=n; i++) {
            for(j =1; j<flag ;j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println(" ");
            flag= flag + 2;
        }
        
    }
}
