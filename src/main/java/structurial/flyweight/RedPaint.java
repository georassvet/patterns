package structurial.flyweight;

public class RedPaint implements Paint {

    public RedPaint() {
        System.out.println(this + " Red paint create");
    }

    public void paint() {
        System.out.println(this + " This is red paint");
    }
}
