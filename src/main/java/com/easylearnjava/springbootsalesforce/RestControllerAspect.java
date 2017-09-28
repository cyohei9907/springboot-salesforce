package com.easylearnjava.springbootsalesforce;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RestControllerAspect {

    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    //Advice is an action taken by an aspect at a particular join point
    @Before("execution(public * com.easylearnjava.springbootsalesforce.*Controller.*(..))")
    public void logBeforeRestCall(JoinPoint point) throws Throwable {
        log.info(" ------------ Before Advice Controller Call  ------------  : " + point);
    }
}
