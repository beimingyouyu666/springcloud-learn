package com.yangk.product.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 测试配置是否实时更新
 * @Author yangkun
 * @Date 2020/4/6
 * @Version 1.0
 */
@RestController
@Slf4j
// 实时刷新配置的注解
@RefreshScope
public class PrintConfigController {

    // 配合 @RefreshScope 实现动态刷新配置
    // 使用 BoyProperties 这种形式会动态刷新，不用加上 @RefreshScope注解
    @Value("${boy.name}")
    private String boyName;

    @RequestMapping("/getConfig")
    public String getConfig() {
        return boyName;
    }

}
