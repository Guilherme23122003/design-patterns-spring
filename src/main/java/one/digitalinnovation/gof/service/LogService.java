package one.digitalinnovation.gof.service;

public class LogService {
    private static LogService instance;

    private LogService() {}

    public static LogService getInstance() {
        if (instance == null) {
            instance = new LogService();
        }
        return instance;
    }

    public void log(String msg){
        System.out.println("[LOG] " + msg);
    }
}
