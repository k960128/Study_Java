package com.mystudy.oop01.main;

import com.mystudy.oop01.pojo.Phone;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;

public class PhoneMain1 {

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand="小米5S";
        phone1.price = 1222.9;
        phone1.color="银色";

        phone1.call("张三");
        phone1.sendMessage();


    }



}
