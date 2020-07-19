package com.itheima_02;

import java.io.Serializable;
import java.util.Objects;

public class Student implements   Comparable<Student>, Serializable {
    private String name;
    private int chinese;
    private int english;
    private int math;

    public Student(String name, int chinese, int english, int math) {
        this.name = name;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
    public int getSum(){
        return this.chinese+this.english+this.math;
    }

    @Override
    public int compareTo(Student s) {
        int num=this.getSum()-s.getSum();
        int num2=num==0?this.chinese-s.getChinese():num;
        int num3=num2==0?this.english-s.getEnglish():num2;
        int num4=num3==0?this.name.compareTo(s.getName()):num3;
        return num4;
    }
}
