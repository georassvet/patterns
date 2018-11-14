package creational.builder.ex3;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());
        Product product = director.construct();
        System.out.println(product);
    }
}
