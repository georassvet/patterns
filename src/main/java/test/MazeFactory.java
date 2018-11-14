package test;

public abstract class MazeFactory {
    public abstract Maze makeMaze();
    public abstract Room makeRoom(int number) throws CloneNotSupportedException;
    public abstract Door makeDoor(Room r1, Room r2);
    public abstract Wall makeWall();
}
