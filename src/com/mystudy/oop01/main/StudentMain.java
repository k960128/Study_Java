package com.mystudy.oop01.main;


import com.mystudy.oop01.pojo.Student;

/*
* 使用学生类
* */
public class StudentMain {


    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student);
        student.study();
        student.eat();
        System.out.println(student.getName());
        System.out.println(student.getSex());
        System.out.println(student.getAge());
    }
}
