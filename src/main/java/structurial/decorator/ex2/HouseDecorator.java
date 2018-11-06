package structurial.decorator.ex2;

public class HouseDecorator implements House {

    private House house;

    public HouseDecorator(House house) {
        this.house = house;
    }

    public void build() {
        house.build();
    }
}
