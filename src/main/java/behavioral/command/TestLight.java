package behavioral.command;

public class TestLight {
    public static void main(String[] args) {
        Light light =new Light();
        Switch sw =  new Switch(new LightOn(light),new LightOff(light));
        sw.turnOn();
        sw.turnOff();
        sw.turnOn();
    }
}
