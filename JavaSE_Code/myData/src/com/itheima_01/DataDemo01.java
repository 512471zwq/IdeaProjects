package com.itheima_01;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DataDemo01 {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        System.out.println(d);
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat sdf2=new SimpleDateFormat();
        String s1=sdf1.format(d);
        System.out.println(s1);
        String s2=sdf2.format(d);
        System.out.println(s2);

        String s="2020-05-06 10:45:34";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1=sdf.parse(s);
        System.out.println(d1);

    }
}
