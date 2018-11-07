package behavioral.memento;

public class Caretaker {
    Backuper backuper;

    public void setBackuper(Backuper backuper) {
        this.backuper=backuper;
    }
    public Backuper getBackuper() {
        return backuper;
    }
}
