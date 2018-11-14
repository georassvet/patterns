package creational.builder.ex1;

public class Notebook {
  private String name;
  private OS os;
  private int ram;
  private HardType hardType;

    public void setName(String name) {
        this.name = name;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHardType(HardType hardType) {
        this.hardType = hardType;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                ", os=" + os +
                ", ram=" + ram +
                ", hardType=" + hardType +
                '}';
    }
}
