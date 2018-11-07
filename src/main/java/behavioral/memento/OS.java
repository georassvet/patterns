package behavioral.memento;

import java.util.Date;

public class OS {
    private String name;
    private String data;
    private Date date;

    public OS(String name, String data) {
        this.name = name;
        this.data = data;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "OS{" +
                "name='" + name + '\'' +
                ", data='" + data + '\'' +
                ", date=" + date +
                '}';
    }
}
