package com.zl.sell.exception;

import com.zl.sell.enums.ResultEnum;

/**
 * Created by ZhongLeiDev at 2018/10/24
 * 异常类
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }

}
