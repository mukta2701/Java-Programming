
/*
Input: 
N = 5
arr[] = {4, 1, 3, 9, 7}
Output: 
1 3 4 7 9

Expected Time Complexity: O(N^2).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 103
1 <= arr[i] <= 103
*/
public class BubbleSort1 {
    void bubbleSort(int arr[])
    {
        int n = arr.length ;
        for(int i=0; i<n-1; i++){
            for (int j= i+1; j<n-i-1;j++){
                if(arr[j]> arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length ;
        for(int i=0;i<n; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        BubbleSort1 obj = new BubbleSort1();
        int arr[]= {4, 1, 3, 9, 7};
        obj.bubbleSort(arr);
        System.out.println("Sorted Array ");
        obj.printArray(arr);
        
    }
}
