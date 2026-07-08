package com.cognizant.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {

        logger.info("Application Started");

        logger.debug("Debug message");

        logger.warn("Warning message");

        logger.error("Error message");

        logger.info("Application Finished");
    }
}