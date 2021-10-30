package com.yl.example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: xiaoliang
 * @date: 2021/10/30 23:08
 **/
@RestController
public class HelloController {


    @GetMapping("/test")
    public String test(){
        return "hello spring-mvc";
    }


}
