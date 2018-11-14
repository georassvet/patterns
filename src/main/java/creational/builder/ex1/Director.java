package creational.builder.ex1;

public class Director {
    private NotebookBuilder builder;

    public Director(NotebookBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(NotebookBuilder builder) {
        this.builder = builder;
    }

    public Notebook construct(){
       builder.createNotebook();
       builder.setName();
       builder.setRam();
       builder.setOS();
       builder.setHard();

       return builder.getNotebook();
    }
}
