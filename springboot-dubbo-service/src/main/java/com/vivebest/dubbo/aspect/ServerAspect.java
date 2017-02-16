package com.vivebest.dubbo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by clear on 2017/2/16.
 */
@Aspect
@Component
public class ServerAspect {
    private static final Logger logger = LoggerFactory.getLogger(ServerAspect.class);
    @Around("within(com.alibaba.dubbo.config.annotation.Service)")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{

        logger.info("{"+"method:"+pjp.getSignature().getName()+"}");
        Object obj = pjp.proceed();
        return obj;

    }
}
