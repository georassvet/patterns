package structurial.decorator.ex1;

public class RepairServiceTestDrive {
    public static void main(String[] args) {
        Device device = new ProcessorRepair(new DisplayRepair(new Phone("IPhone 6s. "),55.00),70.00);
        System.out.format("Repair: %s%n Cost: %.2f$%n",device.getDescription(),device.cost());
    }
}
