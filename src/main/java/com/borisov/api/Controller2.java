package com.borisov.api;

import com.borisov.starter.MyWrapperForController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/controller2")
public class Controller2 {

    @GetMapping("/m1")
    public Map<String, Object> controller2method1() {
        return Map.of("Controller: ", "2", "Method: ", "1");
    }

    @GetMapping("/m2")
    public Map<String, Object> controller2method2() {
        return Map.of("Controller: ", "2", "Method: ", "2");
    }
}
