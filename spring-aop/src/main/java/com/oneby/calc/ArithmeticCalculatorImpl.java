package com.oneby.calc;

import org.springframework.stereotype.Component;

/**
 * @ClassName ArithmeticCalculatorImpl
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/22 22:02
 * @Version 1.0
 */
@Component
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {
    @Override
    public void add(int i, int j) {
        int result = i + j;
        System.out.println("计算器计算得到的结果为： " + result);
    }

    @Override
    public void sub(int i, int j) {
        int result = i - j;
        System.out.println("计算器计算得到的结果为： " + result);
    }

    @Override
    public void mul(int i, int j) {
        int result = i * j;
        System.out.println("计算器计算得到的结果为： " + result);
    }

    @Override
    public void div(int i, int j) {
        int result = i / j;
        System.out.println("计算器计算得到的结果为： " + result);
    }
}
