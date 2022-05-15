package com.xz.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add(){
        System.out.println("ok");
      String msg=  restTemplate.getForObject("http://stock-service/stock/reduce",String.class);

        return "hello " +msg;
    }
}
