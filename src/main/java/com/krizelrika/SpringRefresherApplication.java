package com.krizelrika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringRefresherApplication {

    static void main(String[] args) {

        SpringApplication.run(SpringRefresherApplication.class, args);
    }

    @GetMapping
    public String helloWorld() {
        return "Hello Spring";
    }

}
