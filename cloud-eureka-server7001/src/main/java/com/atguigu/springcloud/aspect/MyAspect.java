package com.atguigu.springcloud.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Author: 朝花夕誓
 * @Date: 2020/12/4 20:02
 * @Version 1.0
 */
@Aspect
@Component
public class MyAspect {

    @Pointcut("@annotation(com.atguigu.springcloud.annotation.MyAnnotation)")
    public void around(){}

    // around notice
    @Around("around()")
    public Object logAround(ProceedingJoinPoint joinPoint){
        // get method name
        String methodName = joinPoint.getSignature().getName();
        // get incoming args
        Object[] args = joinPoint.getArgs();
        StringBuilder sb = new StringBuilder();
        for (Object arg : args) {
            sb.append(arg);
        }
        System.out.println("coming in " + methodName + "method, " + "args is " + sb);

        // method go on
        try {
            return joinPoint.proceed();
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
        System.out.println(methodName +  " is over!");
        return null;
    }

}
