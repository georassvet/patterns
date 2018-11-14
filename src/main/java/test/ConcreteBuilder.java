package test;

public class ConcreteBuilder extends MazeBuilder {

    Maze currentMaze;


    @Override
    void createRoom(int number) {
        if(currentMaze.roomNo(number)!=null){
            Room room = new Room(number);
            currentMaze.addRoom(room);

            room.setSide(Direction.North, new Wall());
            room.setSide(Direction.East, new Wall());
            room.setSide(Direction.West, new Wall());
            room.setSide(Direction.South, new Wall());
        }
    }

    @Override
    void createDoor(int r1, int r2) {
        Room roomFrom = currentMaze.roomNo(r1);
        Room roomTo = currentMaze.roomNo(r2);
        if(roomFrom!=null && roomTo!=null){
            Door door = new Door(roomFrom,roomTo);
            roomFrom.setSide(Direction.West, door);
            roomTo.setSide(Direction.East, door);
        }
    }

    @Override
    void createMaze() {
        currentMaze = new Maze();
    }

    @Override
    Maze getMaze() {
        return null;
    }
}
