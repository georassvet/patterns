package test;

public abstract class MazeBuilder {
    abstract void createRoom(int number);
    abstract void createDoor(int n1, int n2);
    abstract void createMaze();
    abstract Maze getMaze();
}
