package com.joy;

//import org.apache.log4j.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jWithLog4j {

//    private static final Logger LOGGER = Logger.getLogger(Slf4jWithLog4j.class);
    private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jWithLog4j.class);

    public static void main(String[] args) {
        LOGGER.info("hello world, use slf4j-api and log4j");
    }
}
