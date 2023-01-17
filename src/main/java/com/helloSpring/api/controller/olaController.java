package com.helloSpring.api.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/ola")

public class olaController {

    @GetMapping
    public String sayHello() {
        return "Hello spring";

    }
}
