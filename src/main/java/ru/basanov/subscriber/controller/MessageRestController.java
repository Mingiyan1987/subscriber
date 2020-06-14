package ru.basanov.subscriber.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.basanov.subscriber.dto.ActionMessage;
import ru.basanov.subscriber.integration.WelcomeGateway;


@RestController
@RequestMapping("/api")
@Slf4j
public class MessageRestController {

    private WelcomeGateway welcomeGateway;

    @Autowired
    public void setWelcomeGateway(WelcomeGateway welcomeGateway) {
        this.welcomeGateway = welcomeGateway;
    }

    @PostMapping("/message")
    public void addMessage(@RequestBody ActionMessage actionMessage) {
        welcomeGateway.fire(MessageBuilder.withPayload(actionMessage).build());
    }
}
