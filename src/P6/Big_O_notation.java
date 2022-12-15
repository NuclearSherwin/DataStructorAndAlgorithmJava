package P6;

public class Big_O_notation {

    // O (1)
    void printFirstElementOfArray(int[] arr) {
        System.out.printf("First element of array = %d", arr[0]);
    }

    // O(n)
    void printAllElementOfArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.printf("%d\n", arr[i]);
        }
    }

    // O (n ^ 2)
    void printAllPossibleOrderPairs(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%d = %d\n", arr[i], arr[j]);
            }
        }
    }

    // O(2^n)
    int fibonacci(int num) {
        if (num <= 1) return num;
        return fibonacci(num - 2) + fibonacci(num - 1);
    }

    // drop the constants
    void printAllItemsTwice(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.printf("%d\n", arr[i]);
        }

        for (int i= 0; i < size; i++){
            System.out.printf("%d\n", arr[i]);
        }
    }


    public static void main(String[] args) {
        Big_O_notation bO = new Big_O_notation();
        int[] intArr = {1, 2, 3, 4, 5};
//        bO.printFirstElementOfArray(intArr);
//        bO.printAllElementOfArray(intArr, 5);
        bO.printAllPossibleOrderPairs(intArr, 5);
    }


}
