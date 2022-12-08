package Queue;


public class Queue {
    int MAX = 5;
    int Q[] = new int[10];
    int front = 0, rear = 0;    // now queue is empty
    void enqueue(int x) {       // add x to at the end of the queue
        Q[rear] = x;            // add x to position rear
        rear = (rear + 1) % MAX;       // increase rear by 1
    }

    int dequeue(){              // take the first element
       int x = Q[front];
       front = (front + 1) % MAX;     // move co flag
       return x;
    }
    int countEl() {             // count element or get the size
        return (MAX + rear - front) % MAX;
    }

    boolean isEmpty() {
        return (front == rear);
    }

    int Peak(){        // get the front element but not delete it
        return Q[front];
    }

    boolean isFull() {
        if (rear == MAX -1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Queue Qe = new Queue();
        Qe.enqueue(1); Qe.enqueue(2); Qe.enqueue(3); Qe.enqueue(4); Qe.enqueue(5); Qe.enqueue(6);
        System.out.printf("\nFront = %d; rear = %d", Qe.front, Qe.rear);
        int x = Qe.dequeue();   // lay pt dau tien ra
        System.out.printf("\nFront = %d; rear = %d", Qe.front, Qe.rear);
        System.out.printf("\nSo luong PT: %d", Qe.countEl());
        x = Qe.Peak();
        Qe.isEmpty();
        System.out.printf("Front = %d; rear = %d", Qe.front, Qe.rear);
        System.out.printf("\nSo luong PT: %d", Qe.countEl());
        System.out.println();
        System.out.println(Qe.isFull());
    }
}
