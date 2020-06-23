package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Joker_Dong
 * @date 2020-6-23 23:18
 */
@RestController
public class DemoController {
    @GetMapping("/index")
    public String index(){
        return "hello SpringBoot";
    }
}
