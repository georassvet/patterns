package behavioral.strategy.ex1;

public abstract class Transport {

    TransportBehavior behavior;
    String name;

    public void setBehavior(TransportBehavior behavior) {
        this.behavior = behavior;
    }

    public void performBehavior(){
        System.out.println(name);
        behavior.go();
    }
}
