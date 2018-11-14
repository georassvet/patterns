package creational.builder.ex1;

public class WorkNotebookBuilder extends NotebookBuilder {

    @Override
    void setRam() {
    notebook.setRam(16);
    }

    @Override
    void setOS() {
        notebook.setOs(OS.Windows);
    }

    @Override
    void setHard() {
        notebook.setHardType(HardType.Hard);
    }

    @Override
    void setName() {
        notebook.setName("WorkBook");
    }
}
