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
    Car carArr[] = new Car[5];
    int front = 0, rear = 0;

    void addCar(Car car) {
        carArr[rear] = car;
        rear = rear + 1;
    }

    Car outCar(Car car) {
        Car x = carArr[front];
        front = front + 1;
        return x;
    }

    void releasedCar(Car car) {
        car = carArr[front];
    }

    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Model-Y", "Red");
        Car car2 = new Car("Toyota", "Example-1", "Green");
        QueueList carQueue = new QueueList();

        // add car to the wash line
        carQueue.addCar(car1);
        carQueue.addCar(car2);
        carQueue.outCar(car1);

        System.out.printf("\nFront = %d; rear = %d", carQueue.front, carQueue.rear);


    }


}


