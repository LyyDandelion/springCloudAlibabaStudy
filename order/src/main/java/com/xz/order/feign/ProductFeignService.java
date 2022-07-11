package com.xz.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product-service",path = "/product")
public interface ProductFeignService {

    //feign中必须指定@PathVariable 是哪个参数
    @RequestMapping("/{id}")
    String get(@PathVariable("id") Integer id);
}
