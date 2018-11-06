package structurial.adapter;

public class AdapterUsbToRJ45 implements EthernetCable {
    Device device;

    public AdapterUsbToRJ45(Device device){
        this.device =device;
    }

    public void connectRJ45() {
        device.connectUsb();
        System.out.println("Подключаем в RJ45");
    }
}
