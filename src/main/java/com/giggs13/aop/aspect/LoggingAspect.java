package com.giggs13.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // @Before("execution(void com.giggs13.aop.dao.AccountDAO.addSillyMember())")
    // @Before("execution(public void add*())")
    // @Before("execution(* add*())")
    // @Before("execution(* add*(com.giggs13.aop.Account))")
    // @Before("execution(* add*(com.giggs13.aop.Account, *))")
    // @Before("execution(* add*(com.giggs13.aop.Account, ..))")
    // @Before("execution(* add*(..))") // any number of parameters including 0
    // @Before("execution(* add*(*))") // only 1 parameter
    @Before("execution(* com.giggs13.aop.dao.*.*(..))")
    public void beforeAddAccountAdvice() {
        System.out.println("\n---> Executing @Before advice on method");
    }
}
