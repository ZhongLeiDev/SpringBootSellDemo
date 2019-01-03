package com.zl.sell.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum {
    /**新订单*/
    NEW(0, "新订单"),
    /**已完成订单*/
    FINISHED(1, "已完成订单"),
    /**已取消订单*/
    CANCEL(2, "已取消订单"),

    ;

    private Integer code;

    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
