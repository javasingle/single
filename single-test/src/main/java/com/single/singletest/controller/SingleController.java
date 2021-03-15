package com.single.singletest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SingleController {

    @RequestMapping(value = "single")
    public String singletest() {
        System.out.println("SPRINGBOOT-CONTROLLER-TEST");
        return "hello word";
    }

    @RequestMapping(value = "/{ip:.+}")
    @ResponseBody
    public String getIp(@PathVariable("ip") String ip) {
        System.out.println(ip);
        return ip;

    }
}
