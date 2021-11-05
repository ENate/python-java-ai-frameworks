package com.minejava.valuespringyaml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController

    
    @Value("${hello.message}")
    private String helloMessage;

    @Value("Same file message")
    private String someMessage;

    @GetMapping("/greetings")
    public String receiveGreeting() {
        return helloMessage;
    }
}
