package behavioral.chain;

public abstract class Handler {

    private int priority;
    private Handler nextHandler;

    public Handler(int priority) {
        this.priority = priority;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    void handleMessage(String message, int priority){
        if(priority <= this.priority){
            messageOutput(message);
        }else {
            if(nextHandler != null){
                nextHandler.handleMessage(message,priority);
            }
        }
    }
    public abstract void messageOutput(String message);

}
