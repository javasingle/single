package com.single.singletest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingleController {

    @RequestMapping(value = "single")
    public String singletest(){
        System.out.println("springboot-controller-test");
        return "hello word";
    }
}
