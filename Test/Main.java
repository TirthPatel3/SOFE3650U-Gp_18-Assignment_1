package com.company;

public class Main {

    public static void main(String[] args) {
        //
        AbstractFactory PhoneFactory = ConcreteFactory.getFactory();
        //
        phoneInterface phone1 = PhoneFactory.getPhoneType("Apple");
        phone1.CreateProduct();
        phone1.SetPrice(2599.99);
        phone1.GetPrice();
        //
        phoneInterface phone2 = PhoneFactory.getPhoneType("Samsung");
        phone2.CreateProduct();
        phone2.SetPrice(1349.99);
        phone2.GetPrice();
        //
        phoneInterface phone3 = PhoneFactory.getPhoneType("Samsung");
        phone3.CreateProduct();
        phone3.GetPrice();
    }
}
