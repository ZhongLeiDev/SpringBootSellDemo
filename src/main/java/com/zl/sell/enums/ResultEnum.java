package com.zl.sell.enums;

import lombok.Getter;

/**
 * Created by ZhongLeiDev at 2018/10/24
 */
@Getter
public enum ResultEnum {

    /**参数不正确*/
    PARAM_ERROR(1, "参数不正确"),

    /**商品不存在*/
    PRODUCT_NOT_EXIST(10, "商品不存在"),

    /**商品库存不足*/
    PRODUCT_STOCK_ERROR(11, "商品库存不足"),

    /**订单不存在*/
    ORDER_NOT_EXIST(12, "订单不存在"),

    /**订单详情不存在*/
    ORDERDETAIL_NOT_EXIST(13, "订单详情不存在"),

    /**订单状态不正确*/
    ORDER_STATUS_ERROR(14, "订单状态不正确"),

    /**订单更新失败*/
    ORDER_UPDATE_FAIL(15, "订单更新失败"),

    /**订单详情为空*/
    ORDER_DETAIL_EMPTY(16, "订单详情为空"),

    /**订单支付状态不正确*/
    ORDER_PAY_STATUS_ERROR(17, "订单支付状态不正确"),

    /**购物车为空*/
    CART_EMPTY(18, "购物车为空"),

    /**订单所属者错误*/
    ORDER_OWNER_ERROR(19, "该订单不属于当前用户")
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
