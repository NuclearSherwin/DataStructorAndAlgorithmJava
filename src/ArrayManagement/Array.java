package ArrayManagement;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    Scanner sc = new Scanner(System.in);
    int intArr[] = new int[5];

   // nhap mang
    void inputElement() {
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("Input number at index: " + i);
            intArr[i] = sc.nextInt();
        }
    }

    // print array
    void printArr() {
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
        }
    }

    // chen x vao vi tri P
    int[] insertXToP(int pos, int value) {

        // tao moi mot array
        // create the new array
        int newArr[] = new int[intArr.length + 1];

        // copy array cu sang array moi
        // copy the original array into new array
        for (int i = 0; i < intArr.length + 1; i++) {
            if (i < pos - 1)
                newArr[i] = intArr[i];
            else if (i == pos -1)
                newArr[i] = value;
            else
                newArr[i] = intArr[i - 1];
        }

        return newArr;
    }

    // Search X
    void searchElement(int input) {
        for (int i = 0; i < intArr.length; i++) {
            if (input == intArr[i]) {
                System.out.println("found " + input + " at index: " + i);
            }
        }
    }

    // xoa mot phan tu trong array
//    void deletePosition(int input) {
//        if (input < 0 || input >= intArr.length){
//            System.out.println("Not Found");
//        }
//        int[] anotherArray = new int[intArr.length -1];
//        for (int )
//    }

    // Sort Array
    void softArray() {
        for (int i = 0; i < intArr.length; i++)
            for(int j = intArr.length -1; j > i; j--)
                if (intArr[j] < intArr[j-1]){
                    int t = intArr[j];
                    intArr[j] = intArr[j-1];
                    intArr[j - 1] = t;
                }

    }

    void Selection() {
        for (int i = 0; i < intArr.length; i++) {
            int min = i;
            for (int j = i; j < intArr.length; j++)
                if (intArr[j] < intArr[min])
                    min = j;
            {
                int t = intArr[i]; intArr[i] = intArr[min]; intArr[min] = t;
            }
        }
    }

    void QuickSort(int left, int right) {
        if (left < right) {
            int pivot = intArr[(left + right) / 2];
            int up = left;
            int down = right;
            do {
                while(intArr[up] < pivot) up++;
                while(intArr[down] >= pivot) down--;
                if (up <= down){
                    int t = intArr[up]; intArr[up] = intArr[down]; intArr[down] = t;
                    up++;
                    down--;
                }
            } while(up <= down);
            QuickSort(left, down);
            QuickSort(up, right);
        }
    }

    public static void main(String[] args) {
        // call object
        Scanner sc = new Scanner(System.in);
        Array arr = new Array();
        // call input
        arr.inputElement();
        // print all to the console
        arr.printArr();
        // replace the new value of the position
        System.out.println();


//        System.out.println("Enter the position you want ot insert: ");
//        int pos = sc.nextInt();
//        System.out.println("Value to insert");
//        int value = sc.nextInt();
//
//        arr.intArr = arr.insertXToP(pos, value);
//        System.out.println(Arrays.toString(arr.intArr));
//
//        // find x
//        System.out.println("Enter the number to search: ");
//        int searchValue = sc.nextInt();
//        arr.searchElement(searchValue);

        double start, end, runTime;
        start = System.currentTimeMillis();
        arr.Selection();
        end = System.currentTimeMillis();
        runTime = end - start;

        arr.printArr();
//        System.out.println("Time after selection: " + runTime);
        System.out.println("KB: " + (double) (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024);
    }
}

