package creational.prototype;

public class DocumentFactory {
    Document document;

    public DocumentFactory(Document document) {
        this.document = document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Document cloneDocument() throws CloneNotSupportedException{
        return (Document) document.clone();
    }
}
