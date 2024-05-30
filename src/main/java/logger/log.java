package logger;


public class log implements Observer {


    private static logger.log log;
    private static String logfile = "Logger file: \n";

    public log() {}

    public static synchronized logger.log getLog() {
        if (log == null) {
            log = new log();
        }
        return log;
    }

    @Override
    public synchronized void update(String result) {
        logfile += result + "\n";
    }

    public static synchronized void logInfo(){
        System.out.println(logfile);
    }
}
