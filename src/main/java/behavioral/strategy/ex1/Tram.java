package behavioral.strategy.ex1;

public class Tram extends Transport{
    public Tram(String name, TransportBehavior behavior) {
        this.behavior =behavior;
        this.name =name;
    }
}
