package com.jeffrey.aop.jdk;

import com.jeffrey.aop.UserService;
import com.jeffrey.aop.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: jeffrey
 * @author: Jeffrey
 * @description:
 * @create: 2018-05-21 20:39
 **/
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+" before method........");
        Object result = method.invoke(target, args);
        System.out.println(method.getName()+" after method........");
        return result;
    }

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        InvocationHandler invocationHandler = new MyInvocationHandler(userService);
        UserService proxyUserService = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),userService.getClass().getInterfaces(), invocationHandler);
        proxyUserService.getName(1);
    }
}
