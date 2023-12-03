package com.yj.spring6.example;

import org.springframework.stereotype.Component;

/**
 * @author YangJian
 * @date 2023/11/30 19:51
 * @description
 */

public class CalculatorImpl implements Calculator{

    @Override
    public int add(int i, int j) {
        int result = i + j;
        System.out.println("result==========="+result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        System.out.println("result==========="+result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        System.out.println("result==========="+result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        System.out.println("result==========="+result);
        return result;
    }
}
