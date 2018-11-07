package behavioral.memento;

public class PCTestRestore {
    public static void main(String[] args) throws InterruptedException {
        Caretaker caretaker =new Caretaker();
        OS windows = new OS("Windows 10","Мои документы");
        PC pc = new PC();
        System.out.println("Установили windows 10");
        pc.setOs(windows);
        System.out.println(pc);
        caretaker.setBackuper(pc.makeBackup());
        System.out.println("Делаем backup");

        Thread.sleep(2000);
        OS ubuntu = new OS("Ubuntu 10","Мои документы");
        System.out.println("Установили Ubuntu");
        pc.setOs(ubuntu);
        System.out.println(pc);

        Thread.sleep(2000);
        System.out.println("Ubuntu не подходит, делаем откат");
        pc.getBackup(caretaker.getBackuper());
        System.out.println(pc);
    }
}
