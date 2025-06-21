package singleton;

public class logger {
    private static logger instance;

    // Private constructor to prevent instantiation
    private logger() {
        System.out.println("Logger Initialized.");
    }

    // Public static method to get the single instance
    public static logger getInstance() {
        if (instance == null) {
            instance = new logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
