package com.itheima_01;

public class Student {
    private String name;
    private String age;
    public Student(){};
    public Student(String name,String age){
        this.name = name;
        this.age=age;
    }
    public void show() {
        System.out.println(name + "," + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =name ;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        /*if (age < '0')
            System.out.println("年龄不能为负数");
        else*/
            this.age = age;
    }
}
