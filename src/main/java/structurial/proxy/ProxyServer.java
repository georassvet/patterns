package structurial.proxy;

public class ProxyServer implements Server {

    private Server realServer;

    public ProxyServer(Server realServer) {
        this.realServer = realServer;
    }

    @Override
    public void getRequest() {
        realServer.getRequest();
    }

    @Override
    public void sendAnswer() {
        realServer.sendAnswer();
    }
}
