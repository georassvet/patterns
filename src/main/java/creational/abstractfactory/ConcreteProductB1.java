package creational.abstractfactory;

public class ConcreteProductB1 extends AbstractProductB {
    public ConcreteProductB1(String name) {
        super(name);
    }

    @Override
    void interact(AbstractProductA productA) {
        System.out.println(this.getName() + " interacts with " + productA.getName());
    }
}
