package creational.factoryMethod.ex2;

public class ChocolateIceCream extends IceCream {

    IngredientFactory factory;

    public ChocolateIceCream(IngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    public void prepareIceCream() {
        sugar = factory.getSugar();
        milk = factory.getMilk();
        chocolote = factory.getChocolate();
        fruit = factory.getFruit();
    }
}
