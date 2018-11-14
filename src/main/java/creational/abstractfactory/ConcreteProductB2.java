package creational.abstractfactory;

public class ConcreteProductB2 extends AbstractProductB {
    public ConcreteProductB2(String name) {
        super(name);
    }

    @Override
    void interact(AbstractProductA productA) {
        System.out.println(this.getName() + " interacts with " + productA.getName());
    }
}
