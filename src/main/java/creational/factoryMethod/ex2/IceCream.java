package creational.factoryMethod.ex2;

public abstract class IceCream {

    IngredientFactory ingridiendFactory;

    Milk milk;
    Sugar sugar;
    Chocolate chocolote;
    Fruit fruit;

    public abstract void prepareIceCream();
}
