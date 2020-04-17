package com.mystudy.oop2;

public class Variable {

    /*
    *   成员变量和局部变量的区别：
    *       A：在类中的位置不变
    *           成员变量：类中，方法外
    *           局部变量：方法中或者方法声明上（形参）
    *       B：在内存中的位置不同
    *           成员变量：堆内存
    *           局部变量：栈内存
    *       C：生命周期不同
    *           成员：随着对象的创建而存在，随着对象消失而消失
    *           局部：随着方法的调用而存在，随着方法的调用消失
    *       D：初始化值得问题
    *           成员：有默认值
    *           局部：无默认值，需要先赋值
    *
    * */

    public int x;

    public void show(){
        int y=0;

        System.out.println(x);
        System.out.println(y);
    }
}
