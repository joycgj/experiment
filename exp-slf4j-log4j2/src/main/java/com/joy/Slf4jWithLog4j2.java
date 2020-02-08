package com.joy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jWithLog4j2 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Slf4jWithLog4j2.class);

    public static void main(String[] args) {
        LOGGER.info("hello world, use slf4j-api and log4j2");
    }
}
