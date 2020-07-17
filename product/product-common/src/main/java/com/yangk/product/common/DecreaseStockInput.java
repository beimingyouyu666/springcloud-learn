package com.yangk.product.common;

import lombok.Data;

/**
 * @Description
 * @Author yangkun
 * @Date 2020/4/5
 * @Version 1.0
 */
@Data
public class DecreaseStockInput {

    private String productId;

    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}