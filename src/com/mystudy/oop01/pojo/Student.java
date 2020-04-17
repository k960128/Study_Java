package com.mystudy.oop01.pojo;

/**
 * 类的定义：
 *      类是用来描述现实世界的事物的
 *
 *  事物：
 *      属性：事物的描述信息
 *      行为：事物能够做什么
 *
 *   类是如何和事物进行对应的呢
 *      类：
 *          成员变量
 *          成员方法
 *  需求：写一个学生类
 */
public class Student {

    private String name;
    private int age;
    private String sex;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 吃
     */
    public void eat(){
        System.out.println("吃了汉堡包！");
    }
    /*
    *  学习
    * */
    public void study(){
        System.out.println("好好学习，天天向上！");
    }


}
