package com.zl.sell.utils;

import java.util.Random;

/**
 * Created by ZhongLeiDev at 2018/10/24
 * 索引生成工具类
 */
public class KeyUtil {

    /**
     * 生成随机主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String getUniqueKey() {
        Random random = new Random();
        int a = random.nextInt(900000) + 100000;    // 6 位随机数生成
        return System.currentTimeMillis() + String.valueOf(a);
    }

}
