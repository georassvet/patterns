package behavioral.strategy.ex1;

public class Bus extends Transport{
    public Bus(String name, TransportBehavior behavior){
        this.behavior=behavior;
        this.name = name;
    }
}
