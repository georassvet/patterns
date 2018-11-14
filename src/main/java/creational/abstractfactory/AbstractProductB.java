package creational.abstractfactory;

public abstract class AbstractProductB {
    private String name;

    public String getName() {
        return name;
    }

    public AbstractProductB(String name) {
        this.name = name;
    }

    abstract void interact(AbstractProductA productA);
}
