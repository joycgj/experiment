package com.joy;

import org.apache.log4j.Logger;

public class Log4jToLog4j2 {

    private static final Logger LOGGER = Logger.getLogger(Log4jToLog4j2.class);

    public static void main(String[] args) {
        LOGGER.info("hello world, upgrade log4j to log4j2 over slf4j");

        try {
            int i = 1 / 0;
        } catch (Exception e) {
            LOGGER.error(e);
        }
    }
}
