package creational.builder.ex1;

public class NotebookCreator {
    public static void main(String[] args) {
        Director director =new Director(new WorkNotebookBuilder());
        System.out.println(director.construct());

        director.setBuilder(new HomeNotebookBuilder());
        System.out.println(director.construct());
    }
}
