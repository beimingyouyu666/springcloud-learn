package com.yangk.product.exception;

import com.yangk.product.enums.ResultEnum;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2020/4/5
 * @Version 1.0
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
