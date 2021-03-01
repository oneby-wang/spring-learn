package com.oneby.util;

/**
 * @ClassName MathUtil
 * @Description TODO
 * @Author Oneby
 * @Date 2021/2/22 10:03
 * @Version 1.0
 */
public class MathUtil {

    public static int getRandomInt(int start, int end) {
        return (int) (Math.random() * (end - start + 1) + start);
    }

}
