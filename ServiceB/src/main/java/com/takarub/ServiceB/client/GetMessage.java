package com.takarub.ServiceB.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SERVICEA")
public interface GetMessage {

    @GetMapping("/api/a/Hello")
    public String sayHolle();





}
