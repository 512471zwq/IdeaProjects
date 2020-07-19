package com.itheima_02;

public class Outer {
    private int num=10;
    public class Inner{
        private void show(){
            System.out.println(num);
        }
    }
    public void method(){
        Inner i=new Inner();
        i.show();
    }
}
