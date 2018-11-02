package behavioral.observer.ex1;

public class TestDriveWashingMachine {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        Observer personMan = new Person("Sergey");
        Observer personWoman =new Person("Marina");

        washingMachine.addObserver(personMan);
        washingMachine.addObserver(personWoman);

        washingMachine.wash();
        washingMachine.deleteObserver(personWoman);
        washingMachine.wash();

    }
}
