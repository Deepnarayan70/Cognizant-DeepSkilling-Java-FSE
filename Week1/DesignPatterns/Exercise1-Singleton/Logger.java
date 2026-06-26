public class Logger {
    private static Logger logger = new Logger();
    private Logger() {
    }

    public static Logger getInstance() {
        return logger;
    }

    public void showMessage() {
        System.out.println("Logger is working...");
    }
}