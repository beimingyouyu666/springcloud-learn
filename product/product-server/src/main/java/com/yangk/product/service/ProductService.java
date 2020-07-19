package com.yangk.product.service;

import com.yangk.product.common.DecreaseStockInput;
import com.yangk.product.domain.dos.ProductInfo;

import java.util.List;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2020/4/5
 * @Version 1.0
 */
public interface ProductService {

    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfo> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
