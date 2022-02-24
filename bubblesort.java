public class bubblesort {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    /* Print the array */

    void printArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        bubblesort obj = new bubblesort();
        int arr[] = {64, 34, 15, 12, 30, 47, 11};
        obj.bubbleSort(arr);
        System.out.println("Sorted Array ");
        obj.printArray(arr);
    }
}
