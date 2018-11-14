package creational.builder.ex3;

public class ConcreteBuilder extends Builder {

    @Override
    public void makePart1() {
        setName(" make part1 ");
    }

    @Override
    public void makePart2() {
        setName(" make part2 ");
    }

    @Override
    public void makePart3() {
        setName(" make part3 ");
    }

    @Override
    public void makePart4() {
        setName(" make part4 ");
    }

    private void setName(String name){
        product.setName(product.getName()+name);
    }
}
