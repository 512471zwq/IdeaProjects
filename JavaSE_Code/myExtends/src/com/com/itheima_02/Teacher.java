package com.com.itheima_02;

public class Teacher extends People{
    public Teacher(){}
    public Teacher(String name,int age){
        super(name,age);
    }
    public void teach(){
        System.out.println("我是老师我要教书");
    }
}
