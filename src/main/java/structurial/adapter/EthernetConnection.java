package structurial.adapter;

public class EthernetConnection {
    public static void main(String[] args) {
        Ultrabook ultrabook =new Ultrabook();
        EthernetCable adapter = new AdapterUsbToRJ45(ultrabook);
        adapter.connectRJ45();
    }
}
