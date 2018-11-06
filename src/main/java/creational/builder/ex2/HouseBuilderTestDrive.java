package creational.builder.ex2;

public class HouseBuilderTestDrive {
    public static void main(String[] args) {
        House house = new  House.HouseBuilder("New house", 1350).floors(10).getHouse();
        System.out.println(house);
    }
}
