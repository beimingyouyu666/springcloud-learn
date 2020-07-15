package com.yangk.order.controller;

import com.yangk.product.client.ProductClient;
import com.yangk.product.common.DecreaseStockInput;
import com.yangk.product.common.ProductInfoOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 测试远程调用
 * @Author yangkun
 * @Date 2020/4/6
 * @Version 1.0
 */
@RestController
@Slf4j
public class ClientController {

    @Autowired
    private ProductClient productClient;

    @RequestMapping("/msg")
    public String getMsg() {
        return productClient.productMsg();
    }

    @RequestMapping("/listForOrder")
    public String listForOrder() {
        List<ProductInfoOutput> productInfoOutputs = productClient.listForOrder(Arrays.asList("1"));
        log.info("resp:[{}]",productInfoOutputs);
        return "ok";
    }

    @RequestMapping("/decreaseStock")
    public void decreaseStock() {
        DecreaseStockInput decreaseStockInput = new DecreaseStockInput("1",2);
        List<DecreaseStockInput> list = new ArrayList<>();
        list.add(decreaseStockInput);
        productClient.decreaseStock(list);
    }
}
