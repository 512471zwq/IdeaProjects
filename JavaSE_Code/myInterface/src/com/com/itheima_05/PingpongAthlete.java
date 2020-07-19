package com.com.itheima_05;

public class PingpongAthlete extends Athlete implements SpeakEnglish{
    public PingpongAthlete() {
    }

    public PingpongAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃饭");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员学习英语");
    }
}
