package com.joy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Log4jToLog4j2 {

    private static final Log LOGGER = LogFactory.getLog(Log4jToLog4j2.class);

    public static void main(String[] args) {
        LOGGER.info("hello world, upgrade jcl to log4j2 over slf4j");

        try {
            int i = 1 / 0;
        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error(e);
            }
        }
    }
}
