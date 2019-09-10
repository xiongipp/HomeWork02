package com.xxh.StaticProxy;

public class PersonProxy implements Speakable {
    private Person person;
    public  PersonProxy(Person person){
        this.person=person;
    }
    @Override
    public void speak(String message) {
        this.person.speak(message);

    }
}
