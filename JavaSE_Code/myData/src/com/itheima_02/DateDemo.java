package com.itheima_02;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        DateUtils du=new DateUtils();
        Date d=new Date();
        System.out.println(du.dateToString(d));

        String s="2020-03-04 12:23:34";
        System.out.println(du.stringToDate(s));
    }
}
