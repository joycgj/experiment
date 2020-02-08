package com.joy;

import com.alibaba.fastjson.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class HelloWorld {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) throws InterruptedException {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("AGE", 10);
        jsonObject.put("FULL NAME", "Doe");
        jsonObject.put("DATE OF BIRTH", "2016/12/12 12:12:12");

        for (int i = 0; i < 1; i++) {
//            ThreadContext.put("key1", "value1");
//            ThreadContext.put("key2", null);
//            ThreadContext.put("key3", "");
            MDC.put("hi", "123");
            MDC.put("go", "456");
            MDC.put("co", "");

            LOGGER.info(jsonObject.toJSONString());
            try {
                int n = 1 / 0;
            } catch (Exception e) {
                LOGGER.info("error", e);
            }
        }

//        LOGGER.info("helloWorld is going to shutdown");

        LogManager.shutdown();
        System.out.println("helloWorld stopped");
    }
}
