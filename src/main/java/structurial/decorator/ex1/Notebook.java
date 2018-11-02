package structurial.decorator.ex1;

public class Notebook implements Device {

   private String description;
   private double cost;

    public Notebook(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 0;
    }
}
