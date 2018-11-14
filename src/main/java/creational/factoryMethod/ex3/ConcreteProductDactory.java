package creational.factoryMethod.ex3;

public class ConcreteProductDactory extends ProductFactory {
    @Override
    Product factoryMethod() {
        return new ConcreteProduct();
    }
}
