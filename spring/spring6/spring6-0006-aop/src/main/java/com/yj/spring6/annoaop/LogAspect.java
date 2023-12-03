package com.yj.spring6.annoaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author YangJian
 * @date 2023/11/30 20:25
 * @description
 */
@Aspect
@Component
public class LogAspect {

    @Before(value = "execution(public int com.yj.spring6.annoaop.CalculatorImpl.*(..))")    public void beforeMethod(JoinPoint joinpoint){
        String methodName = joinpoint.getSignature().getName();
        Object[] args = joinpoint.getArgs();
        System.out.println("Logger---->前置通知，方法名称："+methodName + "，参数："+ Arrays.toString(args));
    }

    //@After(value = "execution(public int com.yj.spring6.annoaop.CalculatorImpl.*(..))")
    //public void afterMethod(JoinPoint joinpoint){
    //    String methodName = joinpoint.getSignature().getName();
    //    Object[] args = joinpoint.getArgs();
    //    System.out.println("Logger---->后置通知，方法名称："+methodName );
    //}

    @After(value = "pointCut()")
    public void afterMethod(JoinPoint joinpoint){
        String methodName = joinpoint.getSignature().getName();
        Object[] args = joinpoint.getArgs();
        System.out.println("Logger---->后置通知，方法名称："+methodName );
    }

    //重用切入点表达式
    @Pointcut(value = "execution(* com.yj.spring6.annoaop.CalculatorImpl.*(..))")
    public void pointCut() {}


    // 返回 @AfterReturning
    @AfterReturning(value = "execution(* com.yj.spring6.annoaop.CalculatorImpl.*(..))",returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint,Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->返回通知，方法名称："+methodName+"，返回结果："+result);
    }

    // 异常 @AfterThrowing 获取到目标方法异常信息
    //目标方法出现异常，这个通知执行
    @AfterThrowing(value = "execution(* com.yj.spring6.annoaop.CalculatorImpl.*(..))",throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint,Throwable ex) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Logger-->异常通知，方法名称："+methodName+"，异常信息："+ex);
    }

    // 环绕 @Around()
    @Around("execution(* com.yj.spring6.annoaop.CalculatorImpl.*(..))")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        String argString = Arrays.toString(args);
        Object result = null;
        try {
            System.out.println("Logger-->环绕通知==目标方法之前执行");

            //调用目标方法
            result = joinPoint.proceed();

            System.out.println("Logger-->环绕通知==目标方法返回值之后");
        }catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("Logger-->环绕通知==目标方法出现异常执行");
        } finally {
            System.out.println("Logger-->环绕通知==目标方法执行完毕执行");
        }
        return result;
    }

}
