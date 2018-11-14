package structurial.bridge.ex1;

public class DeliveryTestDrive {
    public static void main(String[] args) {
        Car[] cars = {new BigTrunk(new CarDriver()),
        new SimpleCar(new TrunkDriver())};

        for(Car car : cars){
            car.delivery();
            car.drive();
        }
    }
}
