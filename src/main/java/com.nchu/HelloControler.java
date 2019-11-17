package com.nchu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Decription spring boot 简单测试
 * @RestController 注解相当于 @Controller 和  @RequestBody 的组合
 * @Author yangsj
 * @Date 2019-11-17 15:13
 **/
@RestController
public class HelloControler {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
