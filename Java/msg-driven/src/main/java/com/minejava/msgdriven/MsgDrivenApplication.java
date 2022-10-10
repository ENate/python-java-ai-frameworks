package com.minejava.msgdriven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.SendTo;

import com.minejava.msgdriven.messages.TextPlainMessageConverter;
import com.minejava.msgdriven.model.LogMessage;

import org.springframework.messaging.converter.MessageConverter;


@SpringBootApplication
public class MsgDrivenApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsgDrivenApplication.class, args);
	}
	@Bean
    public MessageConverter providesTextPlainMessageConverter() {
        return new TextPlainMessageConverter();
    }

    //@StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public LogMessage enrichLogMessage(LogMessage log) {
        return new LogMessage(String.format("[1]: %s", log.getMessage()));
    }

}
