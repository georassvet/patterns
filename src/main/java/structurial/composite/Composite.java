package structurial.composite;

public abstract class Composite {
   public void addChild(Composite node){
        throw new UnsupportedOperationException();
    }
    public void deleteChild(Composite node){
        throw new UnsupportedOperationException();
    }
    Composite getNode(){
       throw new UnsupportedOperationException();
    }
    void print(){

    }
}
