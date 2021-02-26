package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 朝花夕誓
 * @Date: 2020/11/22 19:25
 * @Version 1.0
 */
@Configuration
public class ApplicationContextConfig {
    /** 使用 @LoadBalanced 注解赋予 RestTemplate 负载均衡的能力
     *  注意：若要使用自定义注解需要注释掉 @LoadBalanced
     * @return
     */
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
