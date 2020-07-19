package com.com.itheima_05;

public class AthleteDemo {
    public static void main(String[] args) {
        BasketballAthlete ba=new BasketballAthlete("姚明",45);
        System.out.println(ba.getName()+","+ba.getAge());
        ba.eat();
        ba.study();

        BasketballCoach bc=new BasketballCoach("王大治",55);
        System.out.println(bc.getName()+","+bc.getAge());
        bc.eat();
        bc.teach();

        PingpongAthlete pa=new PingpongAthlete("邓亚文",34);
        System.out.println(pa.getName()+","+pa.getAge());
        pa.eat();
        pa.study();
        pa.speakEnglish();

        PingpongCoach pc=new PingpongCoach("林丹",77);
        System.out.println(pc.getName()+","+pc.getAge());
        pc.eat();
        pc.teach();
        pc.speakEnglish();
    }
}
