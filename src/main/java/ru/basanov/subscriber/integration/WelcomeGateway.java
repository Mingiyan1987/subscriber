package ru.basanov.subscriber.integration;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;
import ru.basanov.subscriber.dto.ActionMessage;

@MessagingGateway(name = "welcomeMessageGateway",
                    defaultRequestChannel = "welcomeChannel"
)
public interface WelcomeGateway {

    void fire(Message<ActionMessage> message);
}
