package structurial.decorator.ex2;

public class Heating extends HouseDecorator {
    public Heating(House house) {
        super(house);
    }

    public void makeWarmer(){
        System.out.println("Make warmer");
    }

    public void build() {
        super.build();
        makeWarmer();
    }
}
