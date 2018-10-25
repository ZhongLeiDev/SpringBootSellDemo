package com.zl.sell.enums;

import lombok.Getter;

/**
 * 商品状态枚举
 */
@Getter
public enum ProductStatusEnum {

    /**商品上架*/
    UP(0, "商品上架"),
    /**商品下架*/
    DOWN(1, "商品下架")
    ;

    private Integer code;

    private String msg;

    ProductStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
