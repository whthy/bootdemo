package com.ecidi.bootdemo.test;

import java.util.Arrays;

/**
 * @program: bootdemo
 * @description: 测试类
 * @author: wht
 * @create: 2020-06-17 14:28
 **/
public class Test1 {
    public static void main(String[] args) {
        double[] planGC = { 8, 9, 34, 43, 6, 5, 25, 74, 25, 124, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        double[] actualGC = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
//[0.0, 8.0, 9.0, 34.0, 43.0, 6.0, 5.0, 25.0, 74.0, 25.0, 124.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
        for(int i=0;i<planGC.length;i++){
            actualGC[i+2] = planGC[i];
        }
        /*jiushi*/
        System.out.println(Arrays.toString(actualGC));
    }
}
