package creational.abstractfactory;

public class Client {
    AbstractProductA apa;
    AbstractProductB apb;


    public Client(AbstractFactory factory){
        apa = factory.createProductA();
        apb = factory.createProductB();
    }

    public void run(){
        apb.interact(apa);
    }

}
