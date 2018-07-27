package com.demo.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author gzhou2
 * @date 2018/7/27 18:00
 */

public class Consumer {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consum.xml");

        context.start();
    }

}
