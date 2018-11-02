package behavioral.observer.ex1;

public class Person implements Observer {
    private String  name;
    public Person(String name) {
        this.name =name;
    }

    public void update(String message) {
        System.out.println(name +" got message \""+message+"\"");
    }
}
