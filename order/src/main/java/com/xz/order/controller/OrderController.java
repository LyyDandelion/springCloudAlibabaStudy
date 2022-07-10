package com.xz.order.controller;

import com.xz.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

  /*  @Autowired
    RestTemplate restTemplate;*/

    @Autowired
    StockFeignService stockFeignService;

    @RequestMapping("/add")
    public String add() {
/*
        System.out.println("ok");
      String msg=  restTemplate.getForObject("http://stock-service/stock/reduce",String.class);
*/

        String msg = stockFeignService.reduce();
        return "hello  Feign " + msg;
    }

}
