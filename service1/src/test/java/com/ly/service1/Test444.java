package com.ly.service1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Test444 implements InvocationHandler {

    private Object proxied;

    public Test444(Object proxy){
        this.proxied = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("ccc:::"+proxy.getClass());
        Object invoke = method.invoke(proxied, args);
        return invoke;
    }
}
