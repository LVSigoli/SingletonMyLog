public class MyLog {

private static MyLog uniqueInstance;
    private LogLevel priorityLevel;

    enum LogLevel {
        INFO,
        WARNING,
        ERROR
    }
private void Mylog(){
    LogLevel priorityLevel;
}

    private MyLog() {
        this.priorityLevel = LogLevel.INFO;
    }

    public static synchronized MyLog getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new MyLog();
        }
        return uniqueInstance;
    }
    public void setPriority(LogLevel level) {
        this.priorityLevel = level;
    }

    public void log(String message, LogLevel level) {
        if (level.ordinal() >= this.priorityLevel.ordinal()) {
            switch (level) {
                case INFO:
                    System.out.println("Information message: " + message);
                    break;
                case WARNING:
                    System.out.println("Warning message: " + message);
                    break;
                case ERROR:
                    System.out.println("Error message: " + message);
                    break;
            }
        }
    }
}

