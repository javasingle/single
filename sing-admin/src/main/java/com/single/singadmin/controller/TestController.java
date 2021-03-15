package com.single.singadmin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhenbin
 */
@RestController
@RequestMapping("/single")
public class TestController {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello spring security";
    }
}
