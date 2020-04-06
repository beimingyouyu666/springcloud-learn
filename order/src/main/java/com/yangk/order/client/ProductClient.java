package com.yangk.order.client;

import com.yangk.order.domain.dos.ProductInfo;
import com.yangk.order.domain.dto.CartDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2020/4/6
 * @Version 1.0
 */
@FeignClient(name = "product")
public interface ProductClient {

    @RequestMapping("/msg")
    String productMsg();

    @PostMapping("/product/listForOrder")
    List<ProductInfo> listForOrder(@RequestBody List<String> productIdList);

    @PostMapping("/product/decreaseStock")
    void decreaseStock(@RequestBody List<CartDTO> decreaseStockInputList);
}
