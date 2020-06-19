package com.mystudy.thread01;


/**
 * 多线程：
 *
 * 进程：当前正在运行的程序，一个应用程序在内存中的执行区域
 * 线程：进程中的一个执行控制单元，执行路径
 *
 * 单线程：安全性高，性能低
 * 多线程：同时做多个事情，安全性低，性能高
 *
 *
 *
 *
 * 主方法是单线程
 **/

 public class Main1 {

    public static void main(String[] args) {

        //创建线程实例1
        MyThread mt1 = new MyThread();
        //启动线程
        mt1.start();

        //创建线程实例2
        MyThread mt2 = new MyThread();
        //启动线程
        mt2.start();


    }


}