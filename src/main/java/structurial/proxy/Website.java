package structurial.proxy;

public class Website {
    public static void main(String[] args) {
        Server server = new ProxyServer(new RealServer());

        server.getRequest();
    }
}
