package test;


public class MazeGameFactory {

    public static Maze createMaze(MazeFactory factory){
        Maze maze = factory.makeMaze();
        Room r1 = factory.makeRoom(1);
        Room r2 = factory.makeRoom(2);
        Door d1 = factory.makeDoor(r1,r2);
        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Direction.East, d1);
        r1.setSide(Direction.South, new Wall());
        r1.setSide(Direction.West, new Wall());
        r1.setSide(Direction.North, new Wall());

        r2.setSide(Direction.East, new Wall());
        r2.setSide(Direction.South, new Wall());
        r2.setSide(Direction.West, d1);
        r2.setSide(Direction.North, new Wall());

    return maze;
    }


    public static void main(String[] args) {
        Maze maze = createMaze(new EnchantedMazeFactory());
    }
}
