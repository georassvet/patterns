package structurial.bridge;

public abstract class Car {

    protected Driver driver;

    protected Car(Driver driver) {
        this.driver = driver;
    }

    abstract void drive();
    abstract void  delivery();
}
