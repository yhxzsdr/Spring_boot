package com.baizhi.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/10/18.
 */
//通过Aspect注解来声明切面类
@Configuration
@Aspect
public class LogAspect {

    //  声明一个切点   管理所有的切点位置
    @Pointcut(value = "execution(* com.baizhi.service.*.*(..))")
    public void aa() {
    }


    @Before(value = "aa()")
    public void a(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        String kind = joinPoint.getKind();
        Object target = joinPoint.getTarget();
        Object aThis = joinPoint.getThis();
        Signature signature = joinPoint.getSignature();

        System.out.println("第一个前置式切点");
    }

    @After(value = "aa()")
    public void a2() {
        System.out.println("第一个后置式切点");
    }

}
