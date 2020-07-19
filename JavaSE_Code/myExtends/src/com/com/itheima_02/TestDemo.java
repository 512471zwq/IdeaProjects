package com.com.itheima_02;
/*
    测试类
 */
public class TestDemo {
    public static void main(String[] args) {
        Student std=new Student();
        std.setName("林青霞");
        std.setAge(34);
        std.study();
        Teacher t=new Teacher();
        t.setAge(44);
        t.setName("张三丰");
        t.teach();

        Teacher t2=new Teacher("风清扬",34);
        System.out.println(t2.getName()+t2.getAge());
    }
}
