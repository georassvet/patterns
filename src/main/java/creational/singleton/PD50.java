package creational.singleton;

public class PD50 implements PlavDoc {

    private static PD50 pd50;

    private PD50(){}

   public static PD50 getInstance(){
        if(pd50==null){
            pd50 = new PD50();
        }
        return pd50;
    }

    public void repairShip(Ship ship){
        ship.update();
    }
}

