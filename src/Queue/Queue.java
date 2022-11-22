package Queue;


public class Queue {
    int MAX = 5;
    int Q[] = new int[10];
    int front = 0, rear = 0;    // now queue is empty
    void enqueue(int x) {       // them x vao cuoi queue
        Q[rear] = x;            // dua x vao vi tri rear
        rear = (rear + 1) % MAX;       // increase rear by 1
    }

    int dequeue(){              // lay pt dau tien
       int x = Q[front];
       front = (front + 1) % MAX;     // chuyen co hieu
       return x;
    }
    int countEl() {             // Dem so luong phan tu
        return (MAX + rear - front) % MAX;
    }

    boolean isEmpty() {
        return (front == rear);
    }

    int Peak(){                 // Lay pT dau tien but ko delete
        return Q[front];
    }

    public static void main(String[] args) {
        Queue Qe = new Queue();
        Qe.enqueue(1); Qe.enqueue(2); Qe.enqueue(3);
        System.out.printf("\nFront = %d; rear = %d", Qe.front, Qe.rear);
        int x = Qe.dequeue();   // lay pt dau tien ra
        System.out.printf("\nFront = %d; rear = %d", Qe.front, Qe.rear);
        System.out.printf("\nSo luong PT: %d", Qe.countEl());
        x = Qe.Peak();
        System.out.printf("Front = %d; rear = %d", Qe.front, Qe.rear);
        System.out.printf("\nSo luong PT: %d", Qe.countEl());
    }
}
