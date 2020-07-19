package com.com.itheima_05;

public class PingpongCoach extends Coach implements SpeakEnglish {
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃饭");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教学");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练说英语");
    }
}
