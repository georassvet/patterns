package structurial.decorator.ex1;

public class ProcessorRepair extends ServiceDecorator {

    private double cost;

    public ProcessorRepair(Device device, double cost) {
        super(device);
        this.cost = cost;
    }

    private String makeProcessorRepair(){
        return "Make processor repair. ";
    }

    @Override
    public double cost() {
        return super.cost() + cost;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + makeProcessorRepair();
    }
}
