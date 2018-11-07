package creational.factoryMethod.ex2;

public class IceCreamTest {
    public static void main(String[] args) {
        IceCreamStore store = new BeijingIceCreamStore();
        IceCream iceCream = store.createIceCream("fruit");

        System.out.println(iceCream);

    }
}
