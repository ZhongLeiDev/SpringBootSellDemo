package com.zl.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zl.sell.dataobject.OrderDetail;
import com.zl.sell.dto.OrderDTO;
import com.zl.sell.enums.ResultEnum;
import com.zl.sell.exception.SellException;
import com.zl.sell.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Created by ZhongLeiDev at 2019/1/14
 */
@Slf4j
public class OrderForm2OrderDTO {

    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList;
        try {
           orderDetailList =  gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>(){
                    }.getType());
        } catch (Exception e) {
            log.error("【对象转换】错误，string = {}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }

        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;

    }

}
