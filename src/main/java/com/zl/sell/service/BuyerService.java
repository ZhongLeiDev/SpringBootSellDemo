package com.zl.sell.service;

import com.zl.sell.dto.OrderDTO;

/**
 * 买家操作 Service
 * Created by ZhongLeiDev at 2019/1/15
 */
public interface BuyerService {

    OrderDTO findOrderOne(String openid, String orderId);

    OrderDTO cancelOrder(String openid, String orderId);

}
