package com.xxh.DynamicProxy;

import com.xxh.StaticProxy.Person;
import com.xxh.StaticProxy.Speakable;

import java.lang.reflect.Proxy;

public class TestDynamicProxy {
    public static void main(String[] args) {
        Person person=new Person();
        //newProxyInstance的三个参数：
        //第一个参数是代理对象，由java动态生成。
        //书上的那第二个参数到底是啥@-@，我觉得就是目标对象的实现接口。
        //第三个参数指明调用那个invoke方法去执行
        Speakable speakable=(Speakable)Proxy.newProxyInstance(Speakable.class.getClassLoader(),person.getClass().getInterfaces(),new MyProxy(person));
        speakable.speak("我代理传话");
    }
}
