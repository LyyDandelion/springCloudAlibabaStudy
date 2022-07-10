package com.xz.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ribbon 负载均衡策略不能放在 main application上下文环境，否则就会扫描进去导致全局均使用这一种策略
 *
 * 同时配置main application @RibbonClients 注解
 */
@Configuration
public class RibbonRandomRuleConfig {

    //注入 随机均衡策略
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
