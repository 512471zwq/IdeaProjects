package com.itheima_01;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p=new Phone();
        System.out.println(p.brand);
        System.out.println(p.price);
        p.brand="小米";
        p.price=4333;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.sendMessage();
    }
}
