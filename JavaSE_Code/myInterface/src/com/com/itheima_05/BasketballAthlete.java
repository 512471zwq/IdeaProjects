package com.com.itheima_05;

public class BasketballAthlete extends Athlete {
    public BasketballAthlete() {
    }

    public BasketballAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃饭");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习");
    }
}
