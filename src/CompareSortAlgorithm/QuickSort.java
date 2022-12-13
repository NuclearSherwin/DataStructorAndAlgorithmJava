package CompareSortAlgorithm;

import java.util.Random;

public class QuickSort {

    Random r = new Random();

    // Fill array with random ints
    void fillArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt((1000 - 1) + 1) + 1;
        }
    }
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++)
        {
            if (arr[j] < pivot)
            {
                // first increment i, then swap
                i++;
                swap(arr, i, j);
            }
        }
        // increment i and swap with last element
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // function to print an array
    static void printArray(int[] arr, int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver Code
    public static void main(String[] args) {
        int[] intArr = new int[10000];
        QuickSort qs = new QuickSort();

        qs.fillArr(intArr);

        int n = intArr.length;
        long start_time = System.currentTimeMillis();
        qs.quickSort(intArr, 0, n - 1);
        long end_time = System.currentTimeMillis();
        long total_time = end_time - start_time;
        System.out.println("Sorted array: ");
        qs.printArray(intArr, n);
        System.out.println("Total time of Bubble sort: " + total_time + " Millis seconds");
    }
}
