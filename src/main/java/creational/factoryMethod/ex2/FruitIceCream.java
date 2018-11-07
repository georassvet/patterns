package creational.factoryMethod.ex2;

public class FruitIceCream extends IceCream {

    IngredientFactory factory;

    public FruitIceCream(IngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepareIceCream() {
        milk = factory.getMilk();
    }
}
