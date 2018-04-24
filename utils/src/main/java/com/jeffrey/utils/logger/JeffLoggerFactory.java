package com.jeffrey.utils.logger;

import org.slf4j.LoggerFactory;

public class JeffLoggerFactory {

    private static final LoggerListener DEFAULT_LISTENER = null;

    public static JeffLogger getLogger(Class<?> clazz) {

        if (DEFAULT_LISTENER == null) {
            throw new NullPointerException("default_listener is null");
        }

        JeffLogger jeffLogger = new JeffLogger(LoggerFactory.getLogger(clazz), DEFAULT_LISTENER);

        return jeffLogger;
    }

}
