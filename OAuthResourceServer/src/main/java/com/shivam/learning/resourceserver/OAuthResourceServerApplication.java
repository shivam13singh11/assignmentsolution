package com.shivam.learning.resourceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OAuthResourceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuthResourceServerApplication.class, args);
    }

}
