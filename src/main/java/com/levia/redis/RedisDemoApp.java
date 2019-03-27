package com.levia.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Created By Levia.
 * Date: 2019-03-26
 * TIME: 16:16
 */
@SpringBootApplication
@EnableCaching
public class RedisDemoApp {

    public static void main(String[] args) {
        SpringApplication.run(RedisDemoApp.class, args);
    }
}
