package com.company;

public class PhoneFactory extends AbstractFactory {
    @Override
    public phoneInterface getPhoneType(String phoneType){
        if(phoneType.equalsIgnoreCase("Samsung")) {
            return new SamsungPhone();
        }
        else if(phoneType.equalsIgnoreCase("Apple")) {
            return new ApplePhone();
        }
        return null;
    }
}
