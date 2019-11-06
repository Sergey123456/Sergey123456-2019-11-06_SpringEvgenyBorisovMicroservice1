package com.borisov.api;

import com.borisov.starter.MyWrapperForController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/controller1")
@MyWrapperForController
public class Controller1 {

    @GetMapping("/m1")
    public String controller1method1() {
        return "Hello world!";
    }

    @GetMapping("/m2")
    public Map<String, Object> controller1method2() {
        return Map.of("Controller: ", "1", "Method: ", "2");
    }
}
