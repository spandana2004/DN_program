package singleton;

public class testlogger {
    public static void main(String[] args) {
        logger logger1 = logger.getInstance();
        logger1.log("Message 1");

        logger logger2 = logger.getInstance();
        logger2.log("Message 2");

        System.out.println("Same instance? " + (logger1 == logger2));
    }
}
