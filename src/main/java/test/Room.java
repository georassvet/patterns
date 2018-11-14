package test;

public class Room implements MapSite {

    private MapSite[] sides = new MapSite[4];
    private int number;

    public Room(int number){
        this.number = number;
    }

    public void setSide(Direction direction, MapSite side){

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void getSide(Direction direction){

    }

    @Override
    public void enter() {

    }
}
