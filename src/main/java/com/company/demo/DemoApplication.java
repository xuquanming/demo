package com.company.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//SpringBootApplication:标注这个类是一个SpringBoot的应用
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        //将SpringBoot应用启动
        SpringApplication.run(DemoApplication.class, args);
    }

}
