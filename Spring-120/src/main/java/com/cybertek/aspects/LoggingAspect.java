package com.cybertek.aspects;


import com.cybertek.controller.ProductController;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Pointcut("execution(* com.cybertek.controller.ProductController.*(..))")
    public void pointcut(){
    }

    @Before("pointcut()")
    public void log(){
        logger.info("________________");
    }

    //this is second way of imolementing advice
    @Before("execution(* com.cybertek.controller.ProductController.*(..))")
    public void before(){
        logger.info("________________");
    }

    //execution
    @Pointcut("execution(com.cybertek.controller.ProductController.up*(..))")
    public void anyUpdateOperation(){

    }

    //within
    @Pointcut("within(com.cybertek.controller..*)")
    private void anyControllerOperation(){}

    @Pointcut("@within(org.springframework.stereotype.Service)")
    private void anyServiceAnnotatedOperation(){}

    @Before("anyServiceAnnotatedOperation() || anyControllerOperation() ")
    public void beforeControllerAdvice2(JoinPoint joinPoint){
        logger.info("Before -> Method : {} - Arguments : {} - Target : {}",joinPoint,joinPoint.getArgs(),joinPoint.getTarget());
    }








}
