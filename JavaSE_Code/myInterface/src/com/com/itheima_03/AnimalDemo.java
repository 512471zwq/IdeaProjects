package com.com.itheima_03;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat("mimi",32);
        a.eat();
        ((Cat) a).jump();
    }
}
