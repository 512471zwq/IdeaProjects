package com.itheima_02;

public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i=new InterImpl();
        //i.num=20;
        System.out.println(i.num);
        System.out.println(Inter.num);
    }
}
