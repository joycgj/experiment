package com.joy;

import org.apache.log4j.Logger;

public class Log4jOnly {

    private static final Logger LOGGER = Logger.getLogger(Log4jOnly.class);

    public static void main(String[] args) {
        LOGGER.info("hello world, only use log4j");
    }
}
