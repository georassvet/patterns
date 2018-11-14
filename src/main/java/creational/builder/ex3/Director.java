package creational.builder.ex3;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    Product construct(){
        builder.createProduct();
        builder.makePart1();
        builder.makePart3();
        builder.makePart4();
        return builder.getProduct();
    }
}
