package com.itheima_01;

public class Outer {
    private int num=10;
    public class Inner{
        public void show(){
            System.out.println(num);
        }
    }
    public void method(){
        Inner o=new Inner();
        o.show();
    }
}
