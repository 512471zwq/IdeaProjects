package com.itheima;

public class ArrayDemo {
    public static void main(String[] args) {
        byte a=12,b=44;
        int c=a+b;
        System.out.println(isSame(a,b));
    }
    public static boolean isSame(byte a,byte b){
        return a==b?true:false;
    }
}
