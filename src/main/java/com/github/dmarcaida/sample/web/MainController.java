package com.github.dmarcaida.sample.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class MainController {

    @RequestMapping("/")
    ResponseEntity<String> home() {
        return ResponseEntity.ok("Hello World!");
    }

    public static void main(String[] args) {
        SpringApplication.run(MainController.class);
    }
}
