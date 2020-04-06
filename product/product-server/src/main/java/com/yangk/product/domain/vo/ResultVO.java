package com.yangk.product.domain.vo;

import lombok.Data;

/**
 * @Description http请求返回的最外层对象
 * @Author yangkun
 * @Date 2020/4/5
 * @Version 1.0
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
