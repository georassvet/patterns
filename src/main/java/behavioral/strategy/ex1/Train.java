package behavioral.strategy.ex1;

public class Train extends Transport{

    public Train(String name, TransportBehavior behavior) {
        this.behavior = behavior;
        this.name = name;
    }
}
