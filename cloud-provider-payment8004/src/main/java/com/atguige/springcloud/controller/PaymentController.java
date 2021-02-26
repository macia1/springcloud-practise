package com.atguige.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: 朝花夕誓
 * @Date: 2020/11/29 15:10
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${service.port}")
    private String servicePort;

    @RequestMapping("/payment/zk")
    public String paymentzk(){
        return "spring-cloud with zookeeper:" + servicePort + "\t" + UUID.randomUUID().toString();
    }
}
