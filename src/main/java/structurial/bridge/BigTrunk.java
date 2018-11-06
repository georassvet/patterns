package structurial.bridge;

public class BigTrunk extends Car {

    public BigTrunk(Driver driver) {
        super(driver);
    }

    void drive() {
        driver.driveCar();
        System.out.println("Big trunk");
    }

    void delivery() {
        driver.deliverWeight();
        System.out.println("Big weight");
    }
}
