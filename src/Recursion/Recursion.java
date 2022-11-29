package Recursion;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class Recursion {
    int GT(int n) {
        if (n == 1)                          // base case
            return 1;
        else
            return GT(n - 1);             // recursive call = inductive case
    }

    int fibonacci(int n) {
        if (n <= 2)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    void inDayFibo(int n) {
        for (int i = 0; i < n; i++)
            System.out.print(fibonacci(i) + " ");
    }

    void convertToBinary(int n) {
        if (n > 0) {
            convertToBinary(n / 2);
            System.out.print(n % 2);
        }

    }

    static void towerOfHanoi(int n, char from_rod, char to_rod, char helper_rod)
    {
        if (n == 1) // chi co 1 dia
        {
            System.out.println("Take disk 1 from rod " +  from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, helper_rod, to_rod);
        System.out.println("Take disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, helper_rod, to_rod, from_rod);
    }

    int GCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return GCD(b, a % b);
    }

    public static void main(String[] args) {
        Recursion R = new Recursion();
        int n = 3;
//        System.out.printf("%d! = %d", n, R.GT(n));


        // fibonacci
        System.out.printf("Fibonacci of %d = %d", n, R.fibonacci(n));
        System.out.println();
        System.out.println("Fibonacci squence of " + n + ": ");
        R.inDayFibo(n);
        System.out.println();
        System.out.println("Binary of " + n + ": ");
        R.convertToBinary(n);

        towerOfHanoi(n,'A','C', 'B');
        int a = 15;
        int b = 25;

        System.out.printf("GCD(%d, %d) = %d", a, b,  R.GCD(a, b));
    }
}
