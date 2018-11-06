package creational.prototype;

public class Document implements Cloneable {
    private String name;
    private String author;

    public Document(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Document(name,author);
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
