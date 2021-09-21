package com.company;

public class SamsungPhone implements phoneInterface {
    double savePrice = -1;
    @Override
    public void CreateProduct(){

        System.out.println("The Samsung Phone is created");
    }
    public void GetPrice(){
        if (savePrice==-1)System.out.println("The Samsung Phone Price is not set");
        else System.out.println("The Samsung Phone Price is " + savePrice);
    }
    public void SetPrice(double price){
        System.out.println("The Samsung Phone Price is Set to " + price);
        savePrice=price;
    }

}
