package tn.esprit.walidkhrouf.Aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {
    @Before("execution(* tn.esprit.walidkhrouf.Services.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }

    @After("execution(* tn.esprit.walidkhrouf.Services.*.*(..))")
    public void outOfMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("out of method " + name + " : ");
    }
}

