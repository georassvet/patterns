package structurial.proxy;

public class RealServer implements Server {
    @Override
    public void getRequest() {
        System.out.println("Запрос получен");
    }

    @Override
    public void sendAnswer() {
        System.out.println("Отправлен ответ");
    }
}
