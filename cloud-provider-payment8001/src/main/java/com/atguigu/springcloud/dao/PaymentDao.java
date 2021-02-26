package com.atguigu.springcloud.dao;

import com.atguigu.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author: 朝花夕誓
 * @Date: 2020/11/22 17:51
 * @Version 1.0
 */
@Mapper
@Repository
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(Long id);

}
