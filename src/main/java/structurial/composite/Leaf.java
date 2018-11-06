package structurial.composite;

public class Leaf extends Composite {
    // private Composite parent;
    private String name;
    private double price;
    private boolean isVegetarian;

    public Leaf(String name, double price, boolean isVegetarian){ //, Composite parent) {
        this.name = name;
        this.price = price;
        this.isVegetarian = isVegetarian;
      //  this.parent = parent;
    }

    public Composite getNode() {
        return null;
    }

    @Override
    void print() {
        System.out.println(name+", "+price+", "+ (isVegetarian ? "vegetarian":""));
    }
}
