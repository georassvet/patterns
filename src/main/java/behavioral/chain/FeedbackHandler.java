package behavioral.chain;

public class FeedbackHandler extends Handler{
     public FeedbackHandler(int priority) {
        super(priority);
    }

    @Override
    public void messageOutput(String message) {
        System.out.println("Feedback: " + message);
    }
}
