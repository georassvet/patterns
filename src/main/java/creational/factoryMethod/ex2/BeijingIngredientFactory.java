package creational.factoryMethod.ex2;

public class BeijingIngredientFactory implements  IngredientFactory {
    @Override
    public Milk getMilk() {
        return new Milk("Secret recipe of milk");
    }

    @Override
    public Sugar getSugar() {
        return new Sugar("Not too sweet sugar");
    }

    @Override
    public Fruit getFruit() {
        return new Fruit("The biggest chinese fruits");
    }

    @Override
    public Chocolate getChocolate() {
        return new Chocolate("Not too sweet chocolate");
    }
}
