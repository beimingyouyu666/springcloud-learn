package com.yangk.order.utils;

import java.util.Random;


/**
 * @Description TODO
 * @Author yangkun
 * @Date 2020/4/5
 * @Version 1.0
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
