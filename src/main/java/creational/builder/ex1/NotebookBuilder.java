package creational.builder.ex1;

public abstract class NotebookBuilder {
    protected Notebook notebook;

    void createNotebook(){
        notebook = new Notebook();
    }

    public Notebook getNotebook(){
        return notebook;
    }

    abstract void setRam();
    abstract void setOS();
    abstract void setHard();
    abstract void setName();
}
