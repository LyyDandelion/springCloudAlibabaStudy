package com.xz.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * name :指定调用rest接口所对应服务名
 * path: 指定调用rest接口所在Controller 指定的@RequestMapping
 */
@FeignClient(name = "stock-service",path = "/stock")
public interface StockFeignService {

    @RequestMapping("/reduce")
    String reduce();

}
