package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy
public class TestApplication {
    @RequestMapping(path = "/usine")
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
