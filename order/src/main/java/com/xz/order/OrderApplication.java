package com.xz.order;

import com.xz.ribbon.RibbonRandomRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
/*@RibbonClients(value={
        @RibbonClient(name = "stock-service",configuration = RibbonRandomRuleConfig.class)
})*/
@EnableFeignClients
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }

/*    @Bean
    @LoadBalanced //@LoadBalanced负载均衡
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder)
    {
        RestTemplate restTemplate=restTemplateBuilder.build();
        return restTemplate;
    }*/


}
