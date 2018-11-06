package creational.factory.ex1;

public class VolksvagenRusStore extends VolkswagenStore {
    public Car produceCar(String model) {
        if(model.equals("polo"))
            return new VolksvagenPoloRus();
        else if (model.equals("jetta"))
            return new VolksvagenJettaRus();
        else
            throw new RuntimeException();
    }
}
