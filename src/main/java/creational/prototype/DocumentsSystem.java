package creational.prototype;

public class DocumentsSystem {
    public static void main(String[] args) {
        Document prikaz = new Document("Приказ о назначении на должность", "Sergey Mokhov");
        System.out.println(prikaz);
        System.out.println("==============");
        DocumentFactory factory = new DocumentFactory(prikaz);
        try{
            System.out.println(factory.cloneDocument());
        }catch (CloneNotSupportedException e){
            e.getMessage();
        }

    }
}
