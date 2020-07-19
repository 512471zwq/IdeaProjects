package com.itheima;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        System.out.println("欢迎来到学生管理系统");
        ArrayList<Student> array = new ArrayList<>();
        controlPad(array);

    }

    public static void controlPad(ArrayList<Student> array) {
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.修改学生");
        System.out.println("4.查看所有学生");
        System.out.println("5.退出");
        System.out.println("请输入你的选择：");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                addStudent(array);
                controlPad(array);
                break;
            case "2":
                deleteStudent(array);
                controlPad(array);
                break;
            case "3":
                updateStudent(array);
                controlPad(array);
                break;
            case "4":
                findAllStudent(array);
                controlPad(array);
                break;
            case "5":
                System.out.println("谢谢");
                break;
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String sid = sc.nextLine();
        while(findStudent(array, sid) != -1) {
            System.out.println("您输入的学号已被占用，请重新输入");
            sid = sc.nextLine();
        }
            System.out.println("请输入学生姓名：");
            String name = sc.nextLine();
            System.out.println("请输入学生年龄：");
            String age = sc.nextLine();
            System.out.println("请输入学生住址：");
            String address = sc.nextLine();
            Student s = new Student(sid, name, age, address);
            array.add(s);
            System.out.println("添加成功");
    }

    public static void findAllStudent(ArrayList<Student> array) {
        if(array.size()==0){
            System.out.println("无信息，请先添加信息再查询信息");
            return;
        }
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println('\t'+s.getSid() +'\t' + s.getName() +'\t'+ s.getAge() + '\t' + s.getAddress());
        }
    }

    public static void deleteStudent(ArrayList<Student> array) {
        findAllStudent(array);
        System.out.println("请输入你要删除的学生学号");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        int s = findStudent(array, sid);
        if (s != -1) {
            array.remove(s);
            System.out.println("删除成功");
        } else {
            System.out.println("找不到该学号");
        }
    }

    public static int findStudent(ArrayList<Student> array, String sid) {
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid))
                return i;
        }
        return -1;
    }

    public static void updateStudent(ArrayList<Student> array) {
        findAllStudent(array);
        System.out.println("请输入你要修改的学生学号：");
        Scanner sc = new Scanner(System.in);
        String sid = sc.nextLine();
        int s = findStudent(array, sid);
        if (s != -1) {
            System.out.println("请选择你要修改的学生信息：");
            System.out.println("1.id");
            System.out.println("2.姓名");
            System.out.println("3.年龄");
            System.out.println("4.住址");
            Scanner sc2 = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("请输入更改后的id");
                    String sid2 = sc2.nextLine();
                    array.get(s).setSid(sid2);
                    break;
                case 2:
                    System.out.println("请输入更改后的姓名");
                    String name = sc2.nextLine();
                    array.get(s).setName(name);
                    break;
                case 3:
                    System.out.println("请输入更改后的年龄");
                    String age = sc2.nextLine();
                    array.get(s).setAge(age);
                    break;
                case 4:
                    System.out.println("请输入更改后的住址");
                    String address = sc2.nextLine();
                    array.get(s).setAddress(address);
                    break;
            }
            System.out.println("修改成功");
        } else {
            System.out.println("您输入的学号已被占用，请重新输入");
        }
    }
}
