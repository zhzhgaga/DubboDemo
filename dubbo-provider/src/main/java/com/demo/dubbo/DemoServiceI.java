package com.demo.dubbo;

import java.util.List;

/**
 * @author gzhou2
 * @date 2018/7/27 16:16
 */

public class DemoServiceI implements DemoService {
    public void get(int id) {
        System.out.println(id + " ------- ");
    }
}
