package com.cybertek.aspects;


import com.cybertek.controller.ProductController;
import com.cybertek.entity.Product;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

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
    public void before() {
        logger.info("_______Method implemented  @Before execution_________");
    }

    //execution
//    @Pointcut("execution(com.cybertek.controller.ProductController.up*(..))")
//    public void anyUpdateOperation(){
//
//    }

    //within
    @Pointcut("within(com.cybertek.controller..*)")
    private void anyControllerOperation() {
    }

    @Pointcut("@within(org.springframework.stereotype.Service)")
    private void anyServiceAnnotatedOperation() {
    }

    @Before("anyServiceAnnotatedOperation() || anyControllerOperation() ")
    public void beforeControllerAdvice2(JoinPoint joinPoint) {
        logger.info("Before -> Method : {} - Arguments : {} - Target : {}", joinPoint, joinPoint.getArgs(), joinPoint.getTarget());

    }

        @Before("anyServiceAnnotatedOperation() || anyControllerOperation() ")
        public void beforeControllerAdvice3(JoinPoint joinPoint){
            logger.info("Before -> Method : {} - Arguments : {} - Target : {}",joinPoint,joinPoint.getArgs(),joinPoint.getTarget());
    }

    //around

    @Pointcut("@annotation(org.springframework.web.bind.annotation.PostMapping)")
    private void anyPostProductOperation(){}

    @Pointcut("@annotation(org.springframework.web.bind.annotation.PutMapping)")
    private void anyPutProductOperation(){}

    @Around("anyPostProductOperation()")
    public Object anyPostControllerAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        logger.info("Before(Method : {} - Parameters : {}",proceedingJoinPoint.getSignature().toShortString(),proceedingJoinPoint.getArgs());

        List<Product> results = new ArrayList<>();
        results =(List<Product>) proceedingJoinPoint.proceed();

        logger.info("After(Method: {} - Results : {}",proceedingJoinPoint.getSignature().toShortString(),results);

        return results;
    }






}
