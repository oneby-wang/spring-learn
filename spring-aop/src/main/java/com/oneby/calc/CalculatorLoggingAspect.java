package com.oneby.calc;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName CalcLoggingAspect
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/22 21:57
 * @Version 1.0
 */
@Component
@Aspect
public class CalculatorLoggingAspect {

    @Before(value = "execution(* com.oneby.calc.ArithmeticCalculator.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("@Before 前置通知");
    }

    @After(value = "execution(* com.oneby.calc.ArithmeticCalculator.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("@After 后置通知");
    }

    @AfterReturning(value = "execution(* com.oneby.calc.ArithmeticCalculator.*(..))")
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println("@AfterReturning 返回后通知");
    }

    @AfterThrowing(value = "execution(* com.oneby.calc.ArithmeticCalculator.*(..))")
    public void afterThrowing(JoinPoint joinPoint) {
        System.out.println("@AfterThrowing 异常通知");
    }

    @Around(value = "execution(* com.oneby.calc.ArithmeticCalculator.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("@Around 环绕通知之前");
        proceedingJoinPoint.proceed(); // 执行目标方法
        System.out.println("@Around 环绕通知之后");
    }

}
