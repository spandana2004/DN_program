import singleton.logger;

public class Main {
    public static void main(String[] args) {
        logger logger1 = logger.getInstance();
        logger1.log("First message");

        logger logger2 = logger.getInstance();
        logger2.log("Second message");

        System.out.println("Same instance? " + (logger1 == logger2));
    }
}
