package com.atguigu.springcloud.service;


import com.atguigu.entities.Payment;

/**
 * @Author: 朝花夕誓
 * @Date: 2020/11/22 18:08
 * @Version 1.0
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);


}
