package com.kali.component;


import com.kali.util.Logged;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

import java.util.logging.Logger;

// 使用 @Interceptor 注解声明该类为一个切面
@Interceptor
@Logged  // 只在 @Logged 注解的方法或类上生效
public class LoggingInterceptor {

    private static final Logger LOGGER = Logger.getLogger(LoggingInterceptor.class.getName());

    // 使用 @AroundInvoke 注解来增强方法
    @AroundInvoke
    public Object logMethod(InvocationContext context) throws Exception {
        // 获取方法名称
        String methodName = context.getMethod().getName();
        LOGGER.info("Method " + methodName + " is being invoked");

        // 执行方法
        Object result = context.proceed();

        LOGGER.info("Method " + methodName + " executed successfully");
        return result;
    }
}
