package com.xz.order.interceptor.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 自定义拦截器
 */
public class CustomFeignInterceptor implements RequestInterceptor {
    Logger logger= LoggerFactory.getLogger(this.getClass());
    @Override
    public void apply(RequestTemplate requestTemplate) {
//        requestTemplate.header("xxx","aa");
//        requestTemplate.query("id","11");
        logger.info("feign 拦截器");

    }
}
