package com.xxh.StaticProxy;

public class Person implements Speakable {
    @Override
    public void speak(String message) {
        System.out.println("speak:"+message);
    }
}
