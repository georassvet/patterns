package behavioral.mediator;

public abstract class Mediator {
    private String name;
   private Person personX;
   private Person personY;

    public Mediator(String name) {
        this.name = name;
    }

    public void setPersonX(Person personX) {
        this.personX = personX;
    }

    public void setPersonY(Person personY) {
        this.personY = personY;
    }

    void send(String message, Person person){
        System.out.println("Mediator got message from " + person.getName());
        if(person.equals(personX)){
            System.out.println("Mediator notify " + personY.getName());
            personY.notify(message);
        }else if(person.equals(personY)) {
            System.out.println("Mediator notify " + personX.getName());
            personX.notify(message);
        }
    }
}
