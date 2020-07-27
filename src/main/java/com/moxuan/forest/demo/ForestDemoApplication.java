package com.moxuan.forest.demo;

import com.thebeastshop.forest.springboot.annotation.ForestScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ForestScan(basePackages = "com.moxuan.forest.demo.forest")
public class ForestDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForestDemoApplication.class, args);
    }

}
