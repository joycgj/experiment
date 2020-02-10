package com.joy;

import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

public class Log4jJsonLayout {

    private static final Logger LOGGER = Logger.getLogger(Log4jJsonLayout.class);

    public static void main(String[] args) {
        MDC.put("requestId", "123456");
        MDC.put("userId", "gaojie");
        LOGGER.info("hello world, log4j json layout");

        try {
            int i = 1 / 0;
        } catch (Exception e) {
            LOGGER.error("hello world, log4j json layout", e);
        }
        System.out.println("hello");
        MDC.clear();
    }
}
