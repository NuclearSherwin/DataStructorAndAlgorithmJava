public class StackExample {
    public static void main(String[] args) {
        int x = 4;
        StackExample st = new StackExample();
        st.square(x);
        st.printSquare(x);
    }

    public int multiply(int n) {
        return n * n;
    }
    public int square(int n) {
        return multiply(n);
    }

    public void printSquare(int n) {
        var squared = square(n);
        System.out.println(squared);
    }
}
