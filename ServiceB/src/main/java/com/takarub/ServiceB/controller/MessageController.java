package com.takarub.ServiceB.controller;


import com.takarub.ServiceB.client.GetMessage;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/b")
public class MessageController {

    private final GetMessage message;

    private final static String SERVICE_A = "serviceA";

    public MessageController(GetMessage message) {
        this.message = message;
    }

    @GetMapping("/message")
    @CircuitBreaker(name = SERVICE_A, fallbackMethod = "serviceAFallback")
    public String getMessage(){

        String s = message.sayHolle();

        return "any  " + s;
    }

    public String serviceAFallback(Exception e) {
        return "This is a fallback method for Service A";
    }
}
