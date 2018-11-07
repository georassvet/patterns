package structurial.flyweight;

public class GreenPaint implements Paint {
    public GreenPaint() {
        System.out.println(this + " Green paint create");
    }

    public void paint() {
        System.out.println(this + " This is green paint");
    }
}
