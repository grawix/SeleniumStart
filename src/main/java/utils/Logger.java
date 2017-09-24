package utils;

import org.apache.log4j.LogManager;

public class Logger {

    private static org.apache.log4j.Logger Log = LogManager.getLogger(Logger.class.getName());

    public static void info(String message) {
        Log.info(message);
    }

    public static void warn(String message) {
        Log.warn(message);
    }

    public static void error(String message) {
        Log.error(message);
    }

    public static void fatal(String message) {
        Log.fatal(message);
    }

    public static void debug(String message) {
        Log.debug(message);
    }

}