package com.xxh.StaticProxy;

public class TestStaticProxy {
    public static void main(String[] args) {
        Person person=new Person();
        PersonProxy proxy=new PersonProxy(person);
        proxy.speak("我可以代理传话");
    }
}
