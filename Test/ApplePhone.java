package com.company;

public class ApplePhone implements phoneInterface {
    double savePrice=-1;
    @Override
    public void CreateProduct(){
        System.out.println("The Apple Phone is created");
    }
    public void GetPrice() {
        if (savePrice==-1)System.out.println("The Apple Phone Price is not set");
        else System.out.println("The Apple Phone Price is " + savePrice);
    }
    public void SetPrice(double price){
        System.out.println("The Apple Phone Price is Set to " + price);
        savePrice=price;
    }


}
