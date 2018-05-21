package com.jeffrey.aop.cglib;

import com.jeffrey.aop.UserService;
import com.jeffrey.aop.UserServiceImpl;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: jeffrey
 * @author: Jeffrey
 * @description:
 * @create: 2018-05-21 20:53
 **/
public class CglibProxy implements MethodInterceptor {


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(method.getName() + " before method........");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println(method.getName() + " after method........");
        return result;
    }

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(cglibProxy);
        UserService o = (UserService) enhancer.create();
        o.getName(1);
    }

}
