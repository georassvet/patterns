package structurial.decorator.ex2;

public class DecoratorTestDrive {
    public static void main(String[] args) {
        House house = new Heating(new Pipeline(new Electricity(new WoodHouse())));
        house.build();
    }

}
