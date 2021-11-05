package com.minejava.valuespringyaml;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ValueController {

    // Acces property key from application.properties file
    // File contains value
    @Value("${my.message}")
    private String helloMessage;

    @Value("${my.list.values}")
    private List<String> myListValues;
    // use has to treat the value using SPEL
    @Value("#{${db.connection}}")
    private Map<String, String> dbValuesKV;
    // Assign default value when key has no value
    @Value("${add.default: A default value}")
    private String myDefaultValue;

    @Value("Same file message")
    private String someMessage;

    @GetMapping("/greetings")
    public String receiveGreeting() {
        return helloMessage + myListValues + dbValuesKV;
    }

    @GetMapping("/defaultValue")
    public String getDefaultValue() {
        return myDefaultValue;
    }

    @GetMapping("/listValues")
    public String listValues() {
        return myDefaultValue;
    }
}
