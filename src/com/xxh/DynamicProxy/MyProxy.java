package com.xxh.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler {
    private  Object proxy;
    public MyProxy(Object proxy) {
        this.proxy=proxy;
    }
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        method.invoke(this.proxy,objects);
        return null;
    }
}
