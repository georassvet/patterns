package creational.prototype;

public class GameTest {
    public static void main(String[] args) {
        Character lion = new AnimalCharacter("lion");
        System.out.println(lion);
        CharacterFactory factory = new CharacterFactory(lion);
        System.out.println(factory.makeClone());
    }
}
