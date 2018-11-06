package structurial.composite;

import java.util.ArrayList;
import java.util.List;

public class Node extends Composite {
    private String name;
    private Composite parent;
    private List<Composite> childs;

    public List<Composite> getChilds() {
        return childs;
    }

    public Node(String name){
        this.name = name;
        childs = new ArrayList<Composite>();
    }

    public void addChild(Composite node) {
        childs.add(node);
    }

    public void deleteChild(Composite node) {
        childs.remove(node);
    }

    public Composite getNode() {
        return this;
    }

    @Override
    void print() {
        System.out.println(name);
        for (Composite item : childs){
            item.print();
        }
    }
}
