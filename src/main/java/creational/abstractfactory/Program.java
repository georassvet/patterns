package creational.abstractfactory;

public class Program {
    public static void main(String[] args) {
        Client client = new Client(new ConcreteFactoryB());
        client.run();
    }

}
