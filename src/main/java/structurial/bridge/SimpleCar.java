package structurial.bridge;

public class SimpleCar extends Car {

    public SimpleCar(Driver driver) {
        super(driver);
    }

    void drive() {
        driver.driveCar();
        System.out.println("simple car");
    }

    void delivery() {
        driver.deliverWeight();
        System.out.println("light weight");
    }
}
