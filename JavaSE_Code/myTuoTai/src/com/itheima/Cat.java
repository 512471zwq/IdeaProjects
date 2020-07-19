package com.itheima;

public class Cat extends Animal {
    public int age=45;
    public int weight=483;
    @Override
    public void eat() {
        System.out.println("I am a cat, I want to eat fish");
    }
    public void playGame(){
        System.out.println("cat play ball");
    }
}
