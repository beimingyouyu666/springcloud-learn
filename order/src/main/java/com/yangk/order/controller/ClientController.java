package com.yangk.order.controller;

import com.yangk.order.client.ProductClient;
import com.yangk.order.domain.dos.ProductInfo;
import com.yangk.order.domain.dto.CartDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
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
        List<ProductInfo> productInfos = productClient.listForOrder(Arrays.asList("1"));
        log.info("resp:[{}]",productInfos);
        return "ok";
    }

    @RequestMapping("/decreaseStock")
    public void decreaseStock() {
        CartDTO cartDTO = new CartDTO("1",2);
        List<CartDTO> list = new ArrayList<>();
        list.add(cartDTO);
        productClient.decreaseStock(list);
    }
}
