package creational.builder.ex3;

public abstract class Builder {

    protected Product product;

    public abstract void makePart1();
    public abstract void makePart2();
    public abstract void makePart3();
    public abstract void makePart4();

    public void createProduct(){
        product = new Product();
    }

   public  Product getProduct(){
        return product;
    }
}
