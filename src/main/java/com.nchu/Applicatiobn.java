package com.nchu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Decription @SpringBootApplicat 来标记一个主程序类，说明这是一个 Spring boot 应用
 * @Author yangsj
 * @Date 2019-11-17 15:17
 **/
@SpringBootApplication
public class Applicatiobn {
    public static void main(String[] args) {
        //启动Spring应用
        SpringApplication.run(Applicatiobn.class, args);
    }
}
