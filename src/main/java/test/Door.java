package test;

public class Door implements MapSite {
    boolean open;
    private Room roomFrom;
    private Room roomTo;

    public Door(Room roomFrom, Room roomTo){
        this.roomFrom = roomFrom;
        this.roomTo = roomTo;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void enter() {

    }
    boolean isOpen(){
        return open;
    }
}
