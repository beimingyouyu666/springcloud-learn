package com.yangk.order.exception;

import com.yangk.order.enums.ResultEnum;
import lombok.Data;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2020/4/6
 * @Version 1.0
 */
@Data
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
