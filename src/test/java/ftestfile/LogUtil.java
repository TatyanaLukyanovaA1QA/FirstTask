package ftestfile;

import org.apache.log4j.Logger;

public class LogUtil {
    private static final Logger log = Logger.getLogger(LogUtil.class.getName());

    public static void step(int number, String massage){
        log.info(String.format("Step number %s : ",number) + massage);
    }

    public static void info(String massage){
        log.info(massage);
    }

    public static void error(String massage){
        log.error(massage);
    }
}
