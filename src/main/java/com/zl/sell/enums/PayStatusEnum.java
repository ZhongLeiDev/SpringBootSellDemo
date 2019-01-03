package com.zl.sell.enums;

import lombok.Getter;

@Getter
public enum PayStatusEnum {
    /**等待付款*/
    WAIT(0, "等待付款"),
    /**已付款*/
    SUCCESS(1, "已付款")
    ;

    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
