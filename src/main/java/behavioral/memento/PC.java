package behavioral.memento;

public class PC {
    private OS os;

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public Backuper makeBackup(){
        return new Backuper(os);
    }
    public void getBackup(Backuper backuper){
        this.os = backuper.getOsBackup();
    }

    @Override
    public String toString() {
        return "PC{" +
                "os: " + os +
                '}';
    }
}
