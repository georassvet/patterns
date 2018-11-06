package structurial.flyweight;

public class GreenPaint implements Paint {
    public GreenPaint() {
        System.out.println(this.getClass().toString() + "Green paint create");
    }

    public void paint() {
        System.out.println(this.getClass().toString() + "This is green paint");
    }
}
