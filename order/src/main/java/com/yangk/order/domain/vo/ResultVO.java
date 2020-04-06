package com.yangk.order.domain.vo;

import lombok.Data;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2020/4/5
 * @Version 1.0
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
