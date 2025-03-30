package com.core.springaop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAsspect {


    @Around("execution(* com.core.springaop.controller.*.*(..))")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        // time calculate

        // before
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();  // this is processed for execution before this line
        // you write code that executes before write code after this line
                              // the that execute
        //after
        long end = System.currentTimeMillis();
        System.out.println(" execution time of "+(end-start)+" ms");

        return result;
    }
}
