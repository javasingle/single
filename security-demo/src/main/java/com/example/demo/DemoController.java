package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class DemoController {

    @RequestMapping("/foo/test")
    public String testFoo() {
        return "footest";
    }
    @RequestMapping("/bar/test")
    public String testBar() {
        return "bartest";
    }

}
