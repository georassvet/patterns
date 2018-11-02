package behavioral.observer.ex1;

import java.util.ArrayList;
import java.util.List;

public class WashingMachine implements Subject {
    private List<Observer> observers;

    WashingMachine(){
        observers = new ArrayList<Observer>();
    }


    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers){
            observer.update(message);
        }
    }

    public void wash(){
        System.out.println("Washing process...");
        notifyObservers("Ready!");
    }


}
