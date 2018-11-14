package creational.prototype;

public class Character implements Copyable{
   private String name;

    public Character(String name) {
        this.name=name;
    }

    @Override
    public Object copy() {
        return new Character(name);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                '}';
    }
}
