package behavioral.memento;

public class Backuper {
   private final OS osBackup;

   Backuper(OS osBackup){
       this.osBackup=osBackup;
   }

    public OS getOsBackup() {
        return osBackup;
    }
}
