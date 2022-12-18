package P4;

import ApplicationStack.PlateStack;
import Lab2.ArrayList;
import Lab2.Stack;

import java.util.Scanner;

public class SendingMessage {
    Scanner sc = new Scanner(System.in);
    //TODO Step 1 Read input from S1 (x = S1[i])
    //TODO Step 2 Checking Q is full, if it's not then do step 4 if yes do step 3
    //TODO Step 3 Put S[i] into Q (Q.enqueue(x). i++; Return step 1
    //TODO Step 4 While Q not empty then read 1 element from Q (x = Q.dequeue()) and put into S2. (S2[j] = x), j++
    //TODO Step 5 Checking If i >= S1.length() then implement step 4, if not then implement step 1


    int MAX = 5;
    String Q[] = new String[5];

    int front = 0, rear = 0;

    // String s2 or receiver
    String S2;

    void enqueue(String input) {
        Q[front] = input;
        rear = rear + 1;
    }

    String dequeue() {
        String x = Q[front];
        front = front + 1;
        return x;
    }

    boolean isQueueEmpty() {
        return front == rear;
    }

    boolean isQueueFull() {
        if (front == MAX - 1)
            return true;
        else
            return false;
    }

    String peak() {
        return Q[front];
    }

    void enterString() {
        for (int i = 0; i <= Q.length; i++) {
            if (!isQueueFull()) {
                System.out.printf("String %d", i);
                System.out.println();
                String x = sc.nextLine();
                enqueue(x);
                System.out.println("Current front is: " + peak());

                // send to S2
                deliverMessageToS2();
            }
        }
    }

    void deliverMessageToS2() {
        while(!isQueueEmpty()) {
            S2 = dequeue();
            System.out.println("Received message -> " + S2);
        }
    }


    void sendMessage(String input) {
        if (isQueueFull()) {
            System.out.println("Queue is full!");
        }
        else {
            enqueue(input);
        }
    }

    public static void main(String[] args) {
        SendingMessage sm = new SendingMessage();

        String S1 = "Phong";
//        sm.sendMessage(S1);
        sm.enterString();
//        sm.deliverMessageToS2();
        System.out.println(sm.isQueueEmpty());
    }

}
