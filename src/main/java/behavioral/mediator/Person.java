package behavioral.mediator;

public abstract class Person{

    private Mediator mediator;
    private String name;

    public Person(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name  = name;
    }

    public String getName() {
        return name;
    }

    void sendMessage(String message){
        mediator.send(message,this);
    }
    void notify(String message){
        System.out.println(this.name + " got message: " + message);
    }
}
