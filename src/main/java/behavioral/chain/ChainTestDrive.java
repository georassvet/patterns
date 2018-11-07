package behavioral.chain;

public class ChainTestDrive {
    public static void main(String[] args) {
        Handler spamHandler = new SpamHandler(FirePriority.FIRST);
        Handler feedbackHandler = new FeedbackHandler(FirePriority.SECOND);
        spamHandler.setNextHandler(feedbackHandler);
        spamHandler.handleMessage("Hello world!" , FirePriority.FIRST);
    }
}
