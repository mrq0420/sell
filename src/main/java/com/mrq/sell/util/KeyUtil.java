package com.mrq.sell.util;

import java.util.Random;

public class KeyUtil {

    /**
     *生成唯一主键
     * 格式：时间+6位随机数
     * @return
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();



        Integer a = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(a);
    }
}
