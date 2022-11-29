package Queue;

class Car {
    String carName, model, color;

    // constructors
    public Car(String carName, String model, String color) {
        this.carName = carName;
        this.model = model;
        this.color = color;
    }
    public Car(){}
}

class QueueList {
    int MAX = 5;
    Car Q[] = new Car[5];
    int front = 0, rear = 0;

    void addCar(Car car) {
        Q[rear] = car;
        rear = rear + 1;
    }

    void releasedCar(Car car) {
        car = Q[front];
    }
}


public class CarListWashLine {
    public static void main(String[] args) {

    }
}
