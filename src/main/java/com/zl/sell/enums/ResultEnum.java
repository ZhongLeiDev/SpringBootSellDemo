package com.zl.sell.enums;

import lombok.Getter;

/**
 * Created by ZhongLeiDev at 2018/10/24
 */
@Getter
public enum ResultEnum {

    /**商品不存在*/
    PRODUCT_NOT_EXIST(10, "商品不存在"),

    /**商品库存不足*/
    PRODUCT_STOCK_ERROR(11, "商品库存不足"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
