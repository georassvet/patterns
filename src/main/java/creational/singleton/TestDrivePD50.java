package creational.singleton;

public class TestDrivePD50 {
    public static void main(String[] args) {
        PlavDoc plavDoc = PD50.getInstance();
        System.out.println(PD50.getInstance());
        plavDoc.repairShip(new Submarine());




    }
}
