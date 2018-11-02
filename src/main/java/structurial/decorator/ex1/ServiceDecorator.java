package structurial.decorator.ex1;

public class ServiceDecorator implements Device {
   private Device device;

    public ServiceDecorator(Device device) {
        this.device = device;
    }

    public String getDescription() {
        return device.getDescription();
    }

    public double cost() {
        return device.cost();
    }
}
