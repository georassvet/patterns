package structurial.decorator.ex1;

public class DisplayRepair extends ServiceDecorator {

    private double cost;

    public DisplayRepair(Device device, double cost) {
        super(device);
        this.cost =cost;
    }

    private String makeDisplayRepair(){
        return "Make display repair. ";
    }

    @Override
    public double cost() {
        return super.cost() + cost;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + makeDisplayRepair();
    }
}
