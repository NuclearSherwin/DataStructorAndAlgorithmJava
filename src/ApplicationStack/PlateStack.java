package ApplicationStack;

public class PlateStack {
    private String arrPlate[] = new String[10];
    private int top = -1;
    private int capacity;



    // push plate to the top of store plate
    public void push(String plate) {
//        if (isFull()) {
//            System.out.println("Plate full!");
//            // terminal the problem
//            System.exit(1);
//        }

//        System.out.println("Push plate " + plate);
        top = top + 1;
        arrPlate[top] = plate;
    }

    // pop plate of of the list
    public String pop() {
        String plate = arrPlate[top];
        top = top - 1;
        return plate;
    }

    String peak() {
        return arrPlate[top];
    }

    // check plate if plate empty
    public boolean isEmpty() {
        return top == -1;
    }

    // check plate if stack of plate is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // show all plates in the stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arrPlate[i] + ", ");
        }
    }

    public static void main(String[] args) {
        PlateStack plateManagement = new PlateStack();

        System.out.println("Entering plates to stack");
        // add plate
        plateManagement.push("plate 1");
        plateManagement.push("plate 2");
        plateManagement.push("plate 3");
        plateManagement.printStack();

        System.out.println();
        System.out.println();
        // remove a top plate
        System.out.println("Pop an plate out of stack");
        plateManagement.pop();
        plateManagement.printStack();

        // peak a top element of stack of plates
        System.out.println();
        System.out.println();
        System.out.println("Peak element");
        plateManagement.peak();
        plateManagement.printStack();


    }
}
