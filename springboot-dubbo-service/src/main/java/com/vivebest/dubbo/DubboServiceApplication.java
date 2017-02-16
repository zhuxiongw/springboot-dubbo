package com.vivebest.dubbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * Created by clear on 2017/2/14.
 */
@SpringBootApplication
public class DubboServiceApplication {
    private static final Logger logger = LoggerFactory.getLogger(DubboServiceApplication.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DubboServiceApplication.class);
        logger.debug("app start success!");
    }
}
