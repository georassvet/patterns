package creational.prototype;

public class CharacterFactory {
    private Character character;

    public CharacterFactory(Character character) {
        this.character = character;
    }
    public Character makeClone(){
        return (Character) character.copy();
    }
}
