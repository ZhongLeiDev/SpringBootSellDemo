package com.zl.sell.dto;

import com.zl.sell.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单数据传输对象（DataTransformObject）
 */
@Data
public class OrderDTO {

    /**买家订单Id*/
    private String orderId;

    /**买家名字*/
    private String buyerName;

    /**买家电话*/
    private String buyerPhone;

    /**买家地址*/
    private String buyerAddress;

    /**买家Openid*/
    private String buyerOpenid;

    /**订单总金额*/
    private BigDecimal orderAmount;

    /**订单状态，默认为0新订单*/
    private Integer orderStatus;

    /**支付状态，默认为0等待支付*/
    private Integer payStatus;

    /**创建时间*/
    private Date createTime;

    /**更新时间*/
    private Date updateTime;

    /**订单详情列表*/
    private List<OrderDetail> orderDetailList;

}
