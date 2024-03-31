package com.takarub.ServiceA.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/a")
public class GreetingController {
    private static final Logger LOGGER
            = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping("/Hello")
    public String sayHolle(){
        LOGGER.info("say Hello");

        return "hello from Service A";
    }
}
