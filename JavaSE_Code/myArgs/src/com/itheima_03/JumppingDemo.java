package com.itheima_03;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator j=new JumppingOperator();
        Cat c=new Cat();
        j.useJump(c);

        Jumpping j2 = j.getJump();
        j2.jump();
    }
}
