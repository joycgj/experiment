package com.joy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Slf4jWithLog4j2 {

    public static void main(String[] args) {
        try {
            String log4j2Path = "/Users/gachen/zuora_work/experiment/exp-slf4j-log4j2j-programmatically/src/main/resources/log4j2.xml";
            ConfigurationSource source = new ConfigurationSource(new FileInputStream(log4j2Path));
            Configurator.initialize(null, source);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Logger logger = LoggerFactory.getLogger(Slf4jWithLog4j2.class);
        logger.info("ooooo");
    }
}
