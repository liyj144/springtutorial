package com.common.aop;

import org.aspectj.lang.annotation.*;

/**
 * Created by liyanjie on 2017/1/23.
 */
@Aspect
public class Logging {
    @Pointcut("execution(* com.testioc.*.*(..))")
    private void selectAll(){
    }

    @Before("selectAll()")
    private void beforeAdvice(){
        System.out.println("-----going to setup");
    }

    @After("selectAll()")
    private void afterAdvice(){
        System.out.println("-----setup ok");
    }

    @AfterReturning(pointcut = "selectAll()", returning="retVal")
    private void afterReturningAdvice(Object retVal){
        if(null != retVal){
            System.out.println("-----Returning : " + retVal.toString());
        }else{
            System.out.println("-----Return null .");
        }
    }

    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    private void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("-----There has been an exception: " + ex.toString());
    }

}
