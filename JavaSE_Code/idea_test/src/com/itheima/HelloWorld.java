package com.itheima;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        String s="91 27 46 38 50";
        String [] strArray=s.split(" ");
//        for(int i=0;i<strArray.length;i++){
//            System.out.println(strArray[i]);
//        }
        int [] arr=new int[strArray.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(strArray[i]);
        }
//        for(int i=0;i<s2.length;i++){
//            System.out.println(s2[i]);
//        }
        Arrays.sort(arr);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]).append(" ");
        }
        String s4 = sb.toString();
        System.out.println("result"+s4);
    }
}
