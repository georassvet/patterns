package structurial.decorator.ex1;

public class Tablet implements Device {

    private String description;
    private double cost;

    public Tablet(String description) {
        this.description =description;
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 0;
    }
}
