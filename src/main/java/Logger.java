import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger logger;
    protected int num = 1;

    private Logger() {
    }

    public void log(String message) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("[" + simpleDateFormat.format(date) + " " + num++ + "] " + message);
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
