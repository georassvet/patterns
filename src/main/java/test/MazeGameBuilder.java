package test;

public class MazeGameBuilder {

    static Maze createMaze(MazeBuilder builder){
        builder.createMaze();
        builder.createRoom(1);
        builder.createRoom(2);
        builder.createDoor(1,2);
        return builder.getMaze();
    }


    public static void main(String[] args) {
        Maze maze = createMaze(new ConcreteBuilder());

    }
}
