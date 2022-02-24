/* Write a Java program to generate all combination of 1, 2, or 3 using loop.

Sample Output:
1
2
3
12
13
23
123
*/
public class pattern4 {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 3; i++) 
        {
            for (j = 1; j <= 3; j++) 
            {
                for (k = 1; k <= 3; k++) 
                {
                    if (i != j && i != k && j != k) 
                    {
                        System.out.println(i + " " + j + " " + k + " ");
                    }
                }
            }
        }
    }
}