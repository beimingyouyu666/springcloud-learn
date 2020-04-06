package com.yangk.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 测试feign调用
 * @Author yangkun
 * @Date 2020/4/6
 * @Version 1.0
 */
@RestController
public class ServerController {

    @RequestMapping("/msg")
    public String msg() {
        return "this product msg 2";
    }
}
