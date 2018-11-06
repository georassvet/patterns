package creational.builder.ex2;

public class House {
    private String name;
    private double area;
    private int floors;
    private int rooms;
    private boolean isLift;
    private boolean isUndergroundParking;
    private boolean isSquare;

    public House(String name,
                 double area,
                 int floors,
                 int rooms,
                 boolean isLift,
                 boolean isUndergroundParking,
                 boolean isSquare) {
        this.name = name;
        this.area = area;
        this.floors = floors;
        this.rooms = rooms;
        this.isLift = isLift;
        this.isUndergroundParking = isUndergroundParking;
        this.isSquare = isSquare;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public int getFloors() {
        return floors;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean isLift() {
        return isLift;
    }

    public boolean isUndergroundParking() {
        return isUndergroundParking;
    }

    public boolean isSquare() {
        return isSquare;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", floors=" + floors +
                ", rooms=" + rooms +
                ", isLift=" + isLift +
                ", isUndergroundParking=" + isUndergroundParking +
                ", isSquare=" + isSquare +
                '}';
    }

    public static class HouseBuilder{
        private String nestedName;
        private double nestedArea;
        private int nestedfFloors;
        private int nestedRooms;
        private boolean nestedIsLift;
        private boolean nestedIsUndergroundParking;
        private boolean nestedIsSquare;

        public HouseBuilder(String name, double area) {
            this.nestedName = name;
            this.nestedArea = area;
        }

        public HouseBuilder floors(int floors) {
            this.nestedfFloors = floors;
            return this;
        }

        public HouseBuilder rooms(int rooms) {
            this.nestedRooms = rooms;
            return this;
        }

        public HouseBuilder isLift(boolean isLift) {
            this.nestedIsLift = isLift;
            return this;
        }

        public HouseBuilder undergroundParking(boolean isUndergroundParking) {
            this.nestedIsUndergroundParking = isUndergroundParking;
            return this;
        }

        public HouseBuilder isSquare(boolean isSquare) {
            this.nestedIsSquare = isSquare;
            return this;
        }

        public House getHouse(){
            return new House(nestedName,
                    nestedArea,
                    nestedfFloors,
                    nestedRooms,
                    nestedIsLift,
                    nestedIsUndergroundParking,
                    nestedIsSquare);
        }

    }
}
