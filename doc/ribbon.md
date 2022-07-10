## ribbon
    nacos-discovery依赖ribbon，可以不用引入ribbon依赖
    添加 @LoadBalanced注解即可使用

所有负载均衡策略都会实现IRule接口

    stock-service: #stock-service 为服务名称（提供方）
        ribbon:
        NFLoadBalancerRuleClassName: com.alibaba.cloud.nacos.ribbon.NacosRule #权重策略 