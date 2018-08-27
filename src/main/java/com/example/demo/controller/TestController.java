package com.example.demo.controller;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Wangpl
 * Time 2018/8/26 20:45
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public User sayHello() {
        User user = new User();
        user.setId(1);
        user.setName("Wang");
        user.setAge(18);
        return user;
    }

    @RequestMapping("add/{a}/{b}")
    public Integer add(@PathVariable("a") Integer a, @PathVariable("b") Integer b) {
        return a + b;
    }
}
