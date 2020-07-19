package com.itheima_03;

import java.util.Calendar;

public class MyCalendar {
    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
////        System.out.println(c);
////        System.out.println(Calendar.YEAR);
////        int year = c.get(Calendar.YEAR);
////        int month = c.get(Calendar.MONTH);
////        int date = c.get(Calendar.DATE);
////        System.out.println(year + "年" + month + "月" + date + "日");
////
//
////        int year = c.get(Calendar.YEAR);
////        int month = c.get(Calendar.MONTH)+1;
////        int date = c.get(Calendar.DATE);
////        System.out.println(year + "年" + month + "月" + date + "日");
////        c.set(2048, 12, 11);
////        int year = c.get(Calendar.YEAR);
////        int month = c.get(Calendar.MONTH) + 1;
////        int date = c.get(Calendar.DATE);
////        System.out.println(year + "年" + month + "月" + date + "日");
//        c.set(2046,2,1);
//        c.add(Calendar.DATE,-1);
//
//        System.out.println(c.get(Calendar.DATE));
        System.out.println("start");
        method();
        System.out.println("end");

    }
    public static void method(){
        try{
            int[] arr={1,2,3};
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("不存在");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }



    }
}

















