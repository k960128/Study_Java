package com.mystudy.oop01.pojo;

public class Phone {


    public String brand;
    public double price;
    public String color;


    public void call(String phoneName){
        System.out.println("给"+phoneName+"打电话!");
    }

    public void sendMessage(){
        System.out.println("发送短信");
    }
}
