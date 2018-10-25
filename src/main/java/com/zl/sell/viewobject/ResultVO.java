package com.zl.sell.viewobject;

import lombok.Data;

/**
 * http返回请求的最外层对象
 */
@Data
public class ResultVO<T> {

    /**错误代码*/
    private Integer code;

    /**提示信息*/
    private String msg;

    /**具体内容*/
    private T data;

    public ResultVO() {

    }
}
