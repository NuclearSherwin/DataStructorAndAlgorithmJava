package Softing;

import java.util.Random;

public class BubbleSort {
    void bubbleSort(int arr[]){
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

    // show result
    void printArray(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }



    public static void main(String[] args) {
        BubbleSort bf = new BubbleSort();
        int arr[] = { 6, 1, 8, 2, 4, 7};
        long startTime = System.nanoTime();
        bf.bubbleSort(arr);
        long endTime   = System.nanoTime();
        System.out.println("Softed array");
        long totalTime = endTime - startTime;
        bf.printArray(arr);
        System.out.println(totalTime);

        // Random number generator
        Random r = new Random();

        // Create array of 1000 ints
        int[] intArr = new int[1000];

        // Fill array with random ints
        for( int i = 0; i < intArr.length; i++ ) {
            intArr[i] = r.nextInt();
        }


        // Print result




    }

}
