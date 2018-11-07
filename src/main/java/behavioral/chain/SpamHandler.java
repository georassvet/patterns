package behavioral.chain;

public class SpamHandler extends Handler {

    public SpamHandler(int priority) {
        super(priority);
    }

    @Override
    public void messageOutput(String message) {
        System.out.println("Spam " + message);
    }
}
