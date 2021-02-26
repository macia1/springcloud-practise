package com.atguigu.springcloud.lib;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: 朝花夕誓
 * @Date: 2020/11/29 17:57
 * @Version 1.0
 */
public interface LoadBalance {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
