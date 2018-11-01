package behavioral.strategy.ex1;

public class TestDriveTransport {
    public static void main(String[] args) {
        Transport transport = new Bus("Маршрут 815",new BusBehavior());
        transport.performBehavior();
        transport.setBehavior(new ReactiveBehavior());
        transport.performBehavior();
        transport = new Train("Красная стрела",new RailwayBehavior());
        transport.performBehavior();
        transport.setBehavior(new ReactiveBehavior());
        transport.performBehavior();

    }
}
