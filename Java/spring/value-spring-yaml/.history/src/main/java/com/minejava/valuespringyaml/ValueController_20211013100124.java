package com.minejava.valuespringyaml;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {
    
    @Value("${hello.message}")
    private String helloMessage;

    @Value("Same file message")
    private String someMessage;

    @GetMapping("/greetings")
    public String receiveGreeting() {
        return helloMessage;
    }
}
