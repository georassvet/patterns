package structurial.bridge.ex1;

public abstract class Car {

    protected Driver driver;

    protected Car(Driver driver) {
        this.driver = driver;
    }

    abstract void drive();
    abstract void  delivery();
}
