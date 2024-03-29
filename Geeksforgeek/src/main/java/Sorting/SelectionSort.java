package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
       SelectionSort obj = new SelectionSort();
       int []arr = {64,25,12,22,11};
       obj.sort(arr);
      // System.out.println("Sorted Array");
        //obj.printArray(arr);
    }
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            //Swapping
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            System.out.println("Sorted Array " + arr[i]);
        }
    }
    // Print arrays
    void printArray(int[] arr) {
        for (int i = 0; i < arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}