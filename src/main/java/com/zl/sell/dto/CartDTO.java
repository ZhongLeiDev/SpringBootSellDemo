package com.zl.sell.dto;

import lombok.Data;

/**
 * Created by ZhongLeiDev at 2018/10/24
 * 购物车数据传输对象（DataTransformObject）
 */
@Data
public class CartDTO {

    /**商品Id*/
    private String productId;

    /**商品数量*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
