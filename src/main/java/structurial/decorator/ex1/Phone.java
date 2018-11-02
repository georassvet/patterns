package structurial.decorator.ex1;

public class Phone implements Device {

    private String description;
    private double cost;

    Phone(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return cost;
    }
}
