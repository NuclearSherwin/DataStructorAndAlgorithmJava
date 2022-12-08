package CompareSortAlgorithm;

import java.util.Random;

public class Bubble {
    // Random number generator
    Random r = new Random();

    // Fill array with random ints
    void fillArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt((1000 - 1) + 1) + 1;
        }
    }

    // sorting
    void sortArr(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++)
            for (int j = 0; j < length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j + 1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // Print result
    void printArray(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        Bubble bubbleSoft = new Bubble();
        // Create array of 1000 ints
        int[] intArr = new int[1000];
        System.out.println("Fill to array: ");
        bubbleSoft.fillArr(intArr);
        System.out.println("Before sort:");
        bubbleSoft.printArray(intArr);
        System.out.println("Start to sort");
        long start_time = System.currentTimeMillis();
        bubbleSoft.sortArr(intArr);
        long end_time = System.currentTimeMillis();
        long total_time = end_time - start_time;
        System.out.println("Result after sorting with bubble");
        bubbleSoft.printArray(intArr);
        System.out.println("Total time of Bubble sort: " + total_time + " Millis second");
    }
}
