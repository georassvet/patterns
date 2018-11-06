package creational.factory.ex1;

public class CarTestDrive {
    public static void main(String[] args) {
        VolkswagenStore volkswagenStore = new VolksvagenRusStore();
        Car car = volkswagenStore.produceCar("jetta");
        car.testDrive();
    }
}
