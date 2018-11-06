package structurial.flyweight;

public class RedPaint implements Paint {

    public RedPaint() {
        System.out.println(this.getClass().toString() + " Red paint create");
    }

    public void paint() {
        System.out.println(this.getClass().toString() + "This is red paint");
    }
}
