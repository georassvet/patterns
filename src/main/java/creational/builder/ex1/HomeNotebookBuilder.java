package creational.builder.ex1;

public class HomeNotebookBuilder extends NotebookBuilder {
    @Override
    void setRam() {
        notebook.setRam(8);
    }

    @Override
    void setOS() {
        notebook.setOs(OS.Ubuntu);
    }

    @Override
    void setHard() {
        notebook.setHardType(HardType.SSD);
    }

    @Override
    void setName() {
        notebook.setName("HomeBook");
    }
}
