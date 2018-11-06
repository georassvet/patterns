package structurial.decorator.ex2;

public class Pipeline extends HouseDecorator {

    public Pipeline(House house) {
        super(house);
    }

    public void getWater(){
        System.out.println("Water");
    }

    public void build() {
        super.build();
        getWater();
    }
}
