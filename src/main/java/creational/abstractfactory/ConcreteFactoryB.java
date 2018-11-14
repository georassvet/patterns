package creational.abstractfactory;

public class ConcreteFactoryB extends AbstractFactory {
    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2("Product B2");
    }

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2("Product A2");
    }
}
