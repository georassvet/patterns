package creational.factoryMethod.ex2;

public class BeijingIceCreamStore extends IceCreamStore {
    @Override
    public IceCream createIceCream(String type) {
        IceCream iceCream = null;
        if(type.equals("chocolate"))
            iceCream = new ChocolateIceCream(new BeijingIngredientFactory());
        if(type.equals("fruit")){
            iceCream = new FruitIceCream(new BeijingIngredientFactory());
        }
        return iceCream;
    }
}
