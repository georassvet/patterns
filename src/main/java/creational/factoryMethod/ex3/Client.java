package creational.factoryMethod.ex3;

public class Client {
    public static void main(String[] args) {
        ProductFactory factory = new ConcreteProductDactory();
        System.out.println(factory.factoryMethod());
    }
}
