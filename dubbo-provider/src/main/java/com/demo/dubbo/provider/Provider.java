package com.demo.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author gzhou2
 * @date 2018/7/27 17:01
 */

public class Provider {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("provide.xml");

        context.start();
        System.out.println("Start ...");
        System.in.read();

    }


}
