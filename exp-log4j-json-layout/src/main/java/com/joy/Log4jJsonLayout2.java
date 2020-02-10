package com.joy;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;

public class Log4jJsonLayout2 {

    private static final Logger LOGGER = Logger.getLogger(Log4jJsonLayout2.class);

    public static void main(String[] args) {
        MDC.put("requestId", "123456");
        MDC.put("userId", "gaojie");

        Group group = new Group();
        group.setId(0L);
        group.setName("adminnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");

        User guestUser = new User();
        guestUser.setId(2L);
        guestUser.setName("guestttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt");

        User rootUser = new User();
        rootUser.setId(3L);
        rootUser.setName("roottttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt");

        group.addUser(guestUser);
        group.addUser(rootUser);

        String jsonString = JSON.toJSONString(group);

        try {
            int i = 1 / 0;
        } catch (Exception e) {
            LOGGER.error(jsonString, e);
        }
        System.out.println("hello");
        MDC.clear();
    }
}
