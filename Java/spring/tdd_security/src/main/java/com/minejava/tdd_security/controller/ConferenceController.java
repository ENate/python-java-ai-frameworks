package com.minejava.tdd_security.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConferenceController {

    @GetMapping("/about")
    public String about() {
        return "We are defeating TDD!";
    }

    @GetMapping("/greeting")
    public String greeting(@AuthenticationPrincipal(expression = "username") String username) {
        return "Hello " + username + "!";
    }
}
