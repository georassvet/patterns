package test;

public class CountingMazeBuilder extends MazeBuilder {

    int roomsCount;
    int doorsCount;

    public CountingMazeBuilder() {
        this.roomsCount = 0;
        this.doorsCount = 0;
    }

    @Override
    void createRoom(int number) {
        roomsCount++;
    }

    @Override
    void createDoor(int n1, int n2) {
        doorsCount++;
    }

    @Override
    void createMaze() {

    }

    @Override
    Maze getMaze() {
        return null;
    }
}
