package creational.abstractfactory;

public class ConcreteFactoryA extends AbstractFactory {
    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1("Product B1");
    }

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1("Product A1");
    }

}
