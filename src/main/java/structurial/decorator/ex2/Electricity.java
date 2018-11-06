package structurial.decorator.ex2;

public class Electricity extends HouseDecorator {

    public Electricity(House house) {
        super(house);
    }
    void lightOn(){
        System.out.println("Light on");
    }
    public void build() {
     super.build();
     lightOn();
    }
}
