package test;

public class MazePrototypeFactory extends MazeFactory {

    Maze mazePrototype;
    Room roomPrototype;
    Door doorPrototype;
    Wall wallPrototype;
    MapSite d;

    public MazePrototypeFactory(Maze mazePrototype, Room roomPrototype, Door doorPrototype, Wall wallPrototype) {
        this.mazePrototype = mazePrototype;
        this.roomPrototype = roomPrototype;
        this.doorPrototype = doorPrototype;
        this.wallPrototype = wallPrototype;
    }

    @Override
    public Maze makeMaze() {
        return null;
    }

    @Override
    public Room makeRoom(int number) throws CloneNotSupportedException {
        return (Room)roomPrototype.clone();
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return null;
    }

    @Override
    public Wall makeWall() {
        return null;
    }
}
