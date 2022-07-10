Feign 是Netflix 开发的声明式、模板化的HTTP客户端

Spring Cloud OpenFeign 对Feign进行了增强，使其支持Spring MVC注解，另外还整合了Ribbon和Nacos，从而使得Feign的使用更加方便。


##依赖引入

    <dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
    </dependency>
##添加Feign接口和方法


    /**
    * name :指定调用rest接口所对应服务名
    * path: 指定调用rest接口所在Controller 指定的@RequestMapping
    */
    @FeignClient(name = "stock-service",path = "/stock")
    public interface StockFeignService {
    @RequestMapping("/reduce")
    String reduce();
    }


##注入服务使用

    @Autowired
    StockFeignService stockFeignService;
    
##配置启动注解@EnableFeignClients
    @EnableFeignClients
    public class OrderApplication {
