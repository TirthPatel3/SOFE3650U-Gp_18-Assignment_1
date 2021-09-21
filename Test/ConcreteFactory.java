package com.company;

public class ConcreteFactory {
    public static AbstractFactory getFactory(){
            return new PhoneFactory();
    }
}
