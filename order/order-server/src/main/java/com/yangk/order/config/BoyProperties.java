package com.yangk.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 配置类
 * @Author yangkun
 * @Date 2020/7/18
 * @Version 1.0
 */
@Configuration
@ConfigurationProperties(prefix = "boy")
@Data
public class BoyProperties {

    private String name;

}
